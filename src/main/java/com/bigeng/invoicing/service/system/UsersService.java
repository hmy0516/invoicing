package com.bigeng.invoicing.service.system;

import com.bigeng.invoicing.pojo.system.Users;
import org.springframework.stereotype.Service;

public interface UsersService {

    public Users queryUser(String id);
}
