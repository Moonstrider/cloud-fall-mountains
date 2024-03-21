package com.cloudfall.mountains.note.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author：Robert
 */
@Data
public class NoteListDTO {

    @JsonProperty("diaryList")
    private List<NoteDTO> diaryList;
}
