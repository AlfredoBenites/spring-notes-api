package com.example.notesapp.controller;

import com.example.notesapp.model.Note;
import com.example.notesapp.service.NoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/notes")
    public List<Note> getNotes() {
        return noteService.getAllNotes();
    }

    @PostMapping("/notes")
    public void addNote(@RequestBody Note note) {
        noteService.addNote(note);
    }

    @DeleteMapping("/notes/{id}")
    public String deleteNote(@PathVariable int id) {
        boolean removed = noteService.deleteNoteById(id);
        if (removed) {
            return "Note with ID " + id + " deleted.";
        } else {
            return "Note with ID " + id + "  was not found.";
        }
    }

    @PutMapping("/notes/{id}")
    public String updateNote(@PathVariable int id, @RequestBody Note updatedNote) {
        boolean updated = noteService.updateNoteById(id, updatedNote);
        if (updated) {
            return "Note with ID " + id + " updated.";
        } else {
            return "Note with ID " + id + " not found.";
        }
    }
}
