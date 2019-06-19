package com.bigeng.invoicing.controller.financial;

import com.bigeng.invoicing.pojo.base.Purchorder;
import com.bigeng.invoicing.pojo.base.Purchorderdetail;
import com.bigeng.invoicing.service.base.PurchorderService;
import jxl.write.*;
import org.apache.poi.ss.util.CellRangeAddress;

import org.apache.poi.xssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.List;
import java.util.UUID;

@RestController
public class PurchorderReportController {
    @Autowired
    PurchorderService purchorderService;

@GetMapping("/financial/purchorderReport.xlsx")
@ResponseBody
    public void getPurchorderReport (HttpServletResponse response) throws UnsupportedEncodingException {
        List<Purchorder> purchorders = purchorderService.findAll();

        //建表
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/x-download");
        String fileName= "订购单应付报表"+UUID.randomUUID().toString().replaceAll("-", "");
        fileName =URLEncoder.encode(fileName,"UTF-8");
        response.addHeader("Content-Disposition", "attachment;filename=" + fileName);
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("report");

        //设置格式
        sheet.setDefaultRowHeight((short) (2 * 256));//设置行高
        XSSFFont font = workbook.createFont();
        font.setFontName("宋体");
        font.setFontHeightInPoints((short) 16);

        //注入数据
        String[] fieldName = { "订购单号","供应商", "商品编码","采购数量", "单位", "实际单价", "合计金额","备注","订单总额"};
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell =row.createCell(0);
        cell.setCellValue("订购单号");
        for(int i=1;i<fieldName.length;i++){
            cell = row.createCell(i);
            cell.setCellValue(fieldName[i]);
        }

        XSSFRow rows;
        XSSFCell cells;
        int k=0;
        for (int i=0;i<purchorders.size();i++){
            BigDecimal sum=new BigDecimal("0");
            int size=0;
            for (Purchorderdetail purchorderdetail:purchorders.get(i).getPurchorderdetailList()){
                k++;
                size++;
                rows = sheet.createRow(k);
                rows.createCell(0);
                rows.createCell(1);
                cells = rows.createCell(2);
                cells.setCellValue(purchorderdetail.getC_gid());
                cells = rows.createCell(3);
                cells.setCellValue(purchorderdetail.getF_pquant().toString());
                cells = rows.createCell(4);
                cells.setCellValue(purchorderdetail.getC_unit());
                cells = rows.createCell(5);
                cells.setCellValue(purchorderdetail.getF_price().toString());
                cells = rows.createCell(6);
                cells.setCellValue(purchorderdetail.getF_amount().toString());
                cells = rows.createCell(7);
                cells.setCellValue(purchorderdetail.getC_comment());
                rows.getCell(8);
                sum.add(purchorderdetail.getF_amount());
            }
            rows = sheet.getRow(k);
            rows.getCell(0).setCellValue(purchorders.get(i).getI_pono());
            rows.getCell(1).setCellValue(purchorders.get(i).getC_vendor());
            rows.createCell(8).setCellValue(sum.toString());
            CellRangeAddress cra1 = new CellRangeAddress(k-size+1,k, 0, 0); // 起始行, 终止行, 起始列, 终止列
            CellRangeAddress cra2 = new CellRangeAddress(k-size+1,k, 1, 1); // 起始行, 终止行, 起始列, 终止列
            CellRangeAddress cra3 = new CellRangeAddress(k-size+1,k, 8,8);
            sheet.addMergedRegion(cra1);
            sheet.addMergedRegion(cra2);
            sheet.addMergedRegion(cra3);
        }
        try {
            OutputStream out = response.getOutputStream();
            workbook.write(out);
            out.close();
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
