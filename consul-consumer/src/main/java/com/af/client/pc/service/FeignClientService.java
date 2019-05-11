package com.af.client.pc.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author andyFan
 * @since 2019年05月10日
 */

@FeignClient("produce-service-consul")
public interface FeignClientService {

    /**
     * 消费注册到consul上的服务
     *
     * @return
     */
    @RequestMapping("co/provider")
    String consumer();
}
