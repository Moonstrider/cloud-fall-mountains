package com.cloud.fall.mountains.note.config;

import com.cloud.fall.mountains.note.dto.NoteListDTO;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.InputStream;

/**
 * @author：Robert
 */
@Component
public class DBJsonConfig {

    @Bean
    public NoteListDTO noteListDTO() {
        try (InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.json")) {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode jsonNode = mapper.readValue(in, JsonNode.class);
            String jsonString = mapper.writeValueAsString(jsonNode);
            System.out.println(jsonString);
            return mapper.readValue(jsonString, NoteListDTO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
