package com.lhuc.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author lhucstart
 * @create 2021-05-10 14:23
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    private String name;

    private Integer age;

    private String password;

    private Date createTime;

}
