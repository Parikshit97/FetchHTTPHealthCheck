package fetchhttphealthcheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class FetchHttpHealthCheckApplication {

    public static void main(String[] args) {
        SpringApplication.run(FetchHttpHealthCheckApplication.class, args);
    }

    @GetMapping
    public String getHello(){
        return "Hello";
    }

}
