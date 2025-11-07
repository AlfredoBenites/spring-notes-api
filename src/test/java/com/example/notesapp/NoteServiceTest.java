package com.example.notesapp;

import com.example.notesapp.model.Note;
import com.example.notesapp.service.NoteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NoteServiceTest {

    private NoteService noteService;

    @BeforeEach
    void setUp() {
        noteService = new NoteService();
    }

    @Test
    void testAddNote() {
        Note note = new Note(3, "JUnit Test", "Learning unit testing");
        noteService.addNote(note);
        assertEquals(3, noteService.getAllNotes().size());
        assertEquals("JUnit Test", noteService.getAllNotes().get(2).getTitle());
    }

    @Test
    void testDeleteNoteById() {
        noteService.addNote(new Note(3, "Test", "Delete me"));
        boolean removed = noteService.deleteNoteById(3);
        assertTrue(removed);
        assertEquals(2, noteService.getAllNotes().size());
    }

    @Test
    void testUpdateNoteById() {
        noteService.addNote(new Note(3, "Old Title", "Old content"));
        Note updated = new Note(3, "New Title", "New content");

        boolean updatedResult =  noteService.updateNoteById(3, updated);
        assertTrue(updatedResult);
        assertEquals("New Title", noteService.getAllNotes().get(2).getTitle());
    }
}
