package com.lhuc.mapper;


import com.lhuc.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author lhucstart
 * @create 2021-05-10 14:26
 */
@Mapper
public interface UserMapper {


    List<User> getUserPage();


    @Select("select * from user where id = #{id}")
    User findById(@Param("id") Integer id);


    /**
     * 使用@Param注解
     *
     * @param name
     * @return
     */
    User findByName(@Param("name") String name);


    int insert(@Param("name") String name, @Param("age") Integer age);


    /**
     * 顺序传递参数
     * 存在问题
     *
     * @param name
     * @param age
     * @return
     */
    User selectUser(String name, Integer age);


    /**
     * 使用Map集合传递参数
     *
     * @param params
     * @return
     */
    User selectUserByMap(Map<String, Object> params);


    /**
     * 通过java bean传递多个参数
     *
     * @param user
     * @return
     */

    User selectUserByBean(User user);


    /**
     * 使用JSON传递参数
     *
     * @param params
     * @return
     */
//    List<User> findByJSONObject(JSONObject params);


    /**
     * 传递集合类型参数List、Set、Array
     *
     * @param list
     * @return
     */
    List<User> findByList(List list);


    /**
     * 原生批量插入
     *
     * @param list
     */
    void saveBatchByNative(@Param("arr") List<User> list);
}
