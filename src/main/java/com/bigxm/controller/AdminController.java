package com.bigxm.controller;


import com.bigxm.entity.Account;
import com.bigxm.entity.Admin;
import com.bigxm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AdminController {
    @Autowired   //按类型注入
    private AdminService adminService;

    @RequestMapping("/admin/findAll")
    public String findAll(Model model){
        List<Admin> list = adminService.findAll();
        model.addAttribute("list",list);
        return "admin_list";
    }


}
