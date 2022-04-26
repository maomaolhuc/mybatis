package com.lhuc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lhuc.mapper.EmpMapper;
import com.lhuc.mapper.UserMapper;
import com.lhuc.pojo.Emp;
import com.lhuc.pojo.User;
import com.lhuc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lhucstart
 * @create 2021-05-11 11:29
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private EmpMapper empMapper;


    @Override
    public PageInfo<User> getUserPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userMapper.getUserPage();
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }

    @Override
    public PageInfo<Emp> getEmpPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Emp> list = empMapper.getEmpPage();
        return new PageInfo<>(list);
    }
}
