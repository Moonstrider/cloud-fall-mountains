package com.cloudfall.mountains.note.dto;

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
