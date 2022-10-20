package sk.stu.fei.uim.asosgw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AsosGwApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsosGwApplication.class, args);
    }

}
