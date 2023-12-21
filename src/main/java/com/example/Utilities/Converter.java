package example.Utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import example.url.FetchEndpoint;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.util.List;


public class Converter {
    public static String convertYamlToJson(String yamlString) throws IOException {
        Yaml yaml = new Yaml();
        ObjectMapper objectMapper = new ObjectMapper();

        // Explicitly specify the type as List<FetchEndpoint>
        List<FetchEndpoint> endpointList = yaml.load(yamlString);

        // Convert the list to JSON
        return objectMapper.writeValueAsString(endpointList);
    }
}
