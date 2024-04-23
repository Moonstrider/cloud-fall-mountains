package com.cloud.fall.mountains.note.controller;

import com.cloud.fall.mountains.note.dto.NoteListDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Robert
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/note")
public class NoteController {

    private final NoteListDTO noteListDTO;

    public NoteController(@Qualifier("noteListDTO") NoteListDTO noteListDTO) {
        this.noteListDTO = noteListDTO;
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/diaryList")
    public ResponseEntity<NoteListDTO> getDiaryList() {
        return ResponseEntity.ok(noteListDTO);
    }
}
