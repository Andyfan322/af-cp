package com.af.client.pc.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author andyFan
 * @since 2019年05月10日
 */

@FeignClient(name="produce-service-eureka")
public interface FeignClientService {

    /**
     * 消费
     * @return
     */
    @RequestMapping("ek/provider")
    String consumer();
}
