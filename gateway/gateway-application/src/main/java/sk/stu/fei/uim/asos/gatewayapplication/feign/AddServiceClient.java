package sk.stu.fei.uim.asos.gatewayapplication.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.stu.fei.uim.asos.dto.req.AddRequestDto;
import sk.stu.fei.uim.asos.dto.res.AddResponseDto;
import sk.stu.fei.uim.asos.rest.IAddRestService;

@FeignClient(value = "add", fallback = AddServiceClient.AddServiceClientFallback.class)
public interface AddServiceClient extends IAddRestService {
    @Component
    @RequestMapping("/fallback")
    class AddServiceClientFallback implements AddServiceClient {
        private static final Logger LOG = LoggerFactory.getLogger(AddServiceClientFallback.class);

        @Override
        public AddResponseDto add(AddRequestDto req) {
            LOG.warn("Using fallback add service!!!");
            return new AddResponseDto(req.a() + req.b(), req.a(), req.b(), "fallback");
        }
    }
}
