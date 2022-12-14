package sk.stu.fei.uim.asos.addapplication.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sk.stu.fei.uim.asos.dto.req.AddRequestDto;
import sk.stu.fei.uim.asos.dto.res.AddResponseDto;
import sk.stu.fei.uim.asos.rest.IAddRestService;

@RestController("/add")
public class AddRestService implements IAddRestService {

    @Value("${spring.cloud.consul.discovery.instanceId}")
    private String source;

    @Value("${configNumber}")
    private int configNumber;

    @PutMapping
    @Override
    public AddResponseDto add(@RequestBody AddRequestDto req) {
        return new AddResponseDto(req.a() + req.b() + configNumber, req.a(), req.b(), source);
    }
}
