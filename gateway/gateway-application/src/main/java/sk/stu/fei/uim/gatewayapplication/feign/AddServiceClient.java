package sk.stu.fei.uim.gatewayapplication.feign;

import org.springframework.cloud.openfeign.FeignClient;
import sk.stu.fei.uim.asos.rest.IAddRestService;
import sk.stu.fei.uim.gatewayapplication.hystrix.AddFallbackFactory;

@FeignClient(value = "add", fallbackFactory = AddFallbackFactory.class)
public interface AddServiceClient extends IAddRestService {

}
