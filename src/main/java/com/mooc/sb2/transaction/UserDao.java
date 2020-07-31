package com.mooc.sb2.transaction;


import java.util.List;

public interface UserDao {

    /**
     * 插入
     * @param user	用户信息
     */
    void insertUser(JdbcUser user);

    /**
     * 根据 id 进行删除
     * @param id	主键
     */
    void deleteById(Integer id);

    /**
     * 查询
     * @return	全部
     */
    List<JdbcUser> selectAll();
}