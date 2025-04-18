package com.conference.controller;

import com.conference.service.AdminService;



//这里是刘国辉写的注释
public class AdminController {

    private AdminService adminService;
    //测试拉取
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

}
