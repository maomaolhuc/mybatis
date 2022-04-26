package com.lhuc.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author lhucstart
 * @create 2021-05-10 15:47
 */
@Data
public class Department {

    private int deptId;

    private String deptName;

    private List<Employee> emps;


    private int empId;

    private String empName;


}
