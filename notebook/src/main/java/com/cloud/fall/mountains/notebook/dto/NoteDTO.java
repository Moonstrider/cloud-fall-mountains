package com.cloud.fall.mountains.notebook.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author：Robert
 */
@Data
public class NoteDTO {

    @JsonProperty("id")
    private String id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("text")
    private String text;
}
