package sk.stu.fei.uim.asos.gatewayapplication.feign;

import org.springframework.cloud.openfeign.FeignClient;
import sk.stu.fei.uim.asos.rest.IAddRestService;

@FeignClient(value = "add")
public interface AddServiceClient extends IAddRestService {

}
