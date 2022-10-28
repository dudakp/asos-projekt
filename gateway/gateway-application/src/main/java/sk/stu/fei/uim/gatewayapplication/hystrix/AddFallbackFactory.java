package sk.stu.fei.uim.gatewayapplication.hystrix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;
import sk.stu.fei.uim.asos.dto.req.AddRequestDto;
import sk.stu.fei.uim.asos.dto.res.AddResponseDto;
import sk.stu.fei.uim.gatewayapplication.feign.AddServiceClient;

@Component
public class AddFallbackFactory implements FallbackFactory<AddFallback> {
    private static final Logger LOG = LoggerFactory.getLogger(AddFallbackFactory.class);

    @Override
    public AddFallback create(Throwable cause) {
        LOG.info(cause.getMessage());
        LOG.info("fallomg");
        return new AddFallback();
    }
}
