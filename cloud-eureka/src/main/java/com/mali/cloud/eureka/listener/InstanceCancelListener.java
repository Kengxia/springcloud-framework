package com.mali.cloud.eureka.listener;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: mashuai
 * @Date: 15:35
 * @Description:
 */
@Slf4j
@Configuration
public class InstanceCancelListener implements ApplicationListener<EurekaInstanceCanceledEvent> {
    @Override
    public void onApplicationEvent(EurekaInstanceCanceledEvent event) {
        log.info("服务:{}挂了",event.getAppName());
    }
}
