package com.lhuc.mapper;

import com.lhuc.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by slc on 2022/4/26 21:58
 */
@Mapper
public interface EmpMapper {

    List<Emp> getEmpPage();

}
