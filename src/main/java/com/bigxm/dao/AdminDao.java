package com.bigxm.dao;
import com.bigxm.entity.Admin;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminDao {
    @Select("select * from admin")
    public List<Admin> findAll();
}
