package sk.stu.fei.uim.asos.gatewayapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sk.stu.fei.uim.asos.dto.req.AddRequestDto;
import sk.stu.fei.uim.asos.dto.res.AddResponseDto;
import sk.stu.fei.uim.asos.gatewayapplication.feign.AddServiceClient;

@SpringBootApplication
@EnableFeignClients
@RestController("/gw")
public class GatewayApplication {

    private static final Logger LOG = LoggerFactory.getLogger(GatewayApplication.class);

    private final AddServiceClient addServiceClient;

    public GatewayApplication(AddServiceClient addServiceClient) {
        this.addServiceClient = addServiceClient;
    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @PutMapping("/add")
    public AddResponseDto add(@RequestBody AddRequestDto req) {
        return addServiceClient.add(req);
    }
}
