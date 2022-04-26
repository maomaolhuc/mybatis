package com.lhuc;

import com.lhuc.mapper.DepartmentMapper;
import com.lhuc.mapper.UserMapper;
import com.lhuc.pojo.Department;
import com.lhuc.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisApplicationTests {


    @Resource
    UserMapper userMapper;


    @Resource
    DepartmentMapper departmentMapper;


    @Test
    public void testGetDepartmentEmpAll() {
        List<Department> departmentEmpAll = departmentMapper.getDepartmentEmpAll(1003);
        departmentEmpAll.forEach(System.err::println);

    }


    @Test
    public void testGetDepartmentEmp() {
        List<Department> departmentEmp = departmentMapper.getDepartmentEmp(1003);
        departmentEmp.forEach(System.err::println);
    }


    @Test
    public void testAnnotation() {
        User user = userMapper.findById(1);
        System.err.println(user);
    }


    @Test
    public void testInsert() {
        int result = userMapper.insert("test", 26);
        System.err.println(result);
    }


    @Test
    void contextLoads() {
        User user = userMapper.findByName("蚂蚁金服");
        System.err.println(user);
    }


    @Test
    public void test() {
        User user = userMapper.selectUser("蚂蚁金服", 7);
        System.err.println(user);
    }


    @Test
    public void testMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "蚂蚁金服");
        map.put("age", 7);
        User user = userMapper.selectUserByMap(map);
        System.err.println(user);
    }


    @Test
    public void testBean() {
        User user = new User();
        user.setName("蚂蚁金服");
        user.setAge(7);
        User result = userMapper.selectUserByBean(user);
        System.err.println(result);
    }


/*    @Test
    public void testJSON() {
        User user = new User();
        user.setName("蚂蚁金服");
        user.setAge(7);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "蚂蚁金服");
        jsonObject.put("age", 7);
        List<User> users = userMapper.findByJSONObject(jsonObject);
        users.forEach(System.err::println);
    }*/


    @Test
    public void testList() {
        List<User> arrayList = new ArrayList<>();
        arrayList.add(User.builder().name("蚂蚁金服").age(7).build());
        arrayList.add(User.builder().name("小米科技").age(11).build());
        List<User> list = userMapper.findByList(arrayList);
        list.forEach(System.err::println);
    }


}
