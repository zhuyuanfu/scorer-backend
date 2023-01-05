package cn.edu.njfu.zyf.service;

import cn.edu.njfu.zyf.model.User;

public interface UserService {
    User findUserByUnchangeableCode(String unchangeableCode);
    boolean validateUser(String employeeNumber, String password);
}
