package com.lhuc.service;

import com.github.pagehelper.PageInfo;
import com.lhuc.pojo.Emp;
import com.lhuc.pojo.User;


/**
 * @author lhucstart
 * @create 2021-05-11 11:19
 */
public interface UserService {


    PageInfo<User> getUserPage(int pageNum, int pageSize);

    PageInfo<Emp> getEmpPage(int pageNum, int pageSize);

}
