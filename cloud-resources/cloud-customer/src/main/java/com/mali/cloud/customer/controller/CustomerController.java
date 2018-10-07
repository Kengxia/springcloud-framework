package com.mali.cloud.customer.controller;

import com.mali.cloud.customer.service.ICustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 华安  mashuai_bj@si-tech.com.cn
 * @Title:
 * @Date: Create in 10:21 2018/9/27
 * @Description:
 */
@RestController
public class CustomerController {

    @Resource
    ICustomerService customerService;

    @GetMapping("/getInfo")
    public String getInfo(){
        return customerService.geInfo();
    }

    @GetMapping("/getUserInfo")
    public String getUserInfo(){
        return customerService.getUserInfo();
    }
} 