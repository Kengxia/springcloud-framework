package com.mali.cloud.customer.service;

import com.mali.cloud.customer.service.impl.CustomerServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author 华安  mashuai_bj@si-tech.com.cn
 * @Title:
 * @Date: Create in 10:29 2018/9/27
 * @Description:
 */
@FeignClient(value = "cloud-provider",fallback = CustomerServiceImpl.class)
public interface ICustomerService {

    @GetMapping("/provider/getInfo")
    public String geInfo();
    @GetMapping("/security/getUserInfo")
    public String getUserInfo();
} 