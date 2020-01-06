package com.bigxm.service.impl;

import com.bigxm.dao.AdminDao;
import com.bigxm.entity.Admin;
import com.bigxm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    @Override
    public List<Admin> findAll() {
        return adminDao.findAll();
    }
}
