package seoul.democracy.common.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class JsonUtils {

    private final static ObjectMapper objectMapper = new ObjectMapper();

    public static String asJsonString(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<String, Object> asStringToMap(String string) {
        try {
            return objectMapper.readValue(string, new TypeReference<Map<String, Object>>() {
            });
        } catch (IOException e) {
            return null;
        }
    }
}
