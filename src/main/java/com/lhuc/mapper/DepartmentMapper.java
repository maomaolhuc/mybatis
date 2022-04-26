package com.lhuc.mapper;

import com.lhuc.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lhucstart
 * @create 2021-05-10 16:16
 */
@Mapper
public interface DepartmentMapper {


    List<Department> getDepartmentEmp(int deptid);


    List<Department> getDepartmentEmpAll(int deptid);


}
