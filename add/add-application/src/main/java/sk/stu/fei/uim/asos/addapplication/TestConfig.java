package sk.stu.fei.uim.asos.addapplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

//TODO: Tuto classu po overeni funkcnosti celej appky treba vymazat
@Configuration
public class TestConfig {

    @Value("${configNumber}")
    private int configNumber;

    @Value("${configString}")
    private String configString;

    @PostConstruct
    public void init(){
        System.out.println("myNumber:"+configNumber);
        System.out.println("myString:"+configString);
    }
}
