package com.bigeng.invoicing.mapper.enterprise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentMapper extends JpaRepository<Department,Long> {

}