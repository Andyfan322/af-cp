package hf;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author andyFan
 * @since 2019年05月22日
 */
@FeignClient("produce-service-consul")
public interface FeignClientService {
    @RequestMapping({"co/provider"})
    String consumer();
}
