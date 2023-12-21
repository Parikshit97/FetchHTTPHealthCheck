package example.fetchhttphealthcheck;

import com.fasterxml.jackson.databind.ObjectMapper;
import example.Utilities.Converter;
import example.url.FetchEndpoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@RestController
public class FetchHttpHealthCheckApplication {

    public static void main(String[] args) {
        SpringApplication.run(FetchHttpHealthCheckApplication.class, args);
    }

    @GetMapping("/")
    public FetchEndpoint[] getHealthChecks() throws IOException {
        Path yamlFilePath = Paths.get("src/main/resources/urls.yml");
        String yamlContent = new String(Files.readAllBytes(yamlFilePath));
        String jsonContent = Converter.convertYamlToJson(yamlContent);
        System.out.println(jsonContent);

        ObjectMapper objectMapper = new ObjectMapper();
        List<FetchEndpoint> endpoints = objectMapper.readValue(jsonContent, objectMapper.getTypeFactory().constructCollectionType(List.class, FetchEndpoint.class));
        return endpoints.toArray(new FetchEndpoint[0]);

    }

}
