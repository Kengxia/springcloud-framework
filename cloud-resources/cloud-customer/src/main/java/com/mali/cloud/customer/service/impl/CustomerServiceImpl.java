package com.mali.cloud.customer.service.impl;

import com.mali.cloud.customer.service.ICustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 华安  mashuai_bj@si-tech.com.cn
 * @Title:
 * @Date: Create in 10:56 2018/9/27
 * @Description:
 */
@Slf4j
@Service
public class CustomerServiceImpl implements ICustomerService {
    @Override
    public String geInfo() {
        log.info("调用{}失败","geInfo");
        return "fail";
    }

    @Override
    public String getUserInfo() {
        log.info("调用{}失败","getUserInfo");
        return "fail";
    }
}