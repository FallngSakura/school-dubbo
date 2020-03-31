package club.fallngsakura.school;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author MISAKI RINNE
 */

@EnableDubbo
@SpringBootApplication
public class SchoolConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolConsumerApplication.class, args);
    }

}
