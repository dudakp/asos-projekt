package sk.stu.fei.uim.gatewayapplication.hystrix;

import sk.stu.fei.uim.asos.dto.req.AddRequestDto;
import sk.stu.fei.uim.asos.dto.res.AddResponseDto;
import sk.stu.fei.uim.gatewayapplication.feign.AddServiceClient;

public class AddFallback implements AddServiceClient {
    @Override
    public AddResponseDto add(AddRequestDto req) {
        return new AddResponseDto(req.a()+req.b(), req.a(), req.b(), "fallback");
    }
}
