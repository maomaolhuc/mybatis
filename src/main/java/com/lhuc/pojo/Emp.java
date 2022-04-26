package com.lhuc.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by slc on 2022/4/26 21:49
 */
@Data
public class Emp {

    private BigInteger emp_no;

    private String e_name;

    private String job;

    private BigInteger mgr;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hire_date;

    private BigDecimal sal;

    private BigDecimal comm;

    private Integer dept_no;


}
