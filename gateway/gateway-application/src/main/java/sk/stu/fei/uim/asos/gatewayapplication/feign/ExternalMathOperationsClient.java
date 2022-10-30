package sk.stu.fei.uim.asos.gatewayapplication.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        url = "http://numbersapi.com",
        name = "ext-math-api",
        fallback = ExternalMathOperationsClient.ExternalMathOperationsClientFallback.class
)
public interface ExternalMathOperationsClient {

    @GetMapping("/{num}")
    String getTrivia(@PathVariable("num") Long num);

    @Component
    class ExternalMathOperationsClientFallback implements ExternalMathOperationsClient {

        @Override
        public String getTrivia(Long num) {
            return "unable to ge interesting fact about number: " + num;
        }
    }
}
