package com.example.notesapp.service;

// importing Note class
import com.example.notesapp.model.Note;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class NoteService {

    private final List<Note> notes = new ArrayList<>();

    // Setting default values inside notes
    // Every value is of class Note
    public NoteService() {
        notes.add(new Note(1, "Buy groceries", "Milk, eggs, bread"));
        notes.add(new Note(2, "Study java", "Review OOP"));
    }

    // Getter for array notes
    public List<Note> getAllNotes() {
        return notes;
    }

    // Setter/Adding new notes to the notes arraylist
    public void addNote(Note note) {
        notes.add(note);
    }

    // Deleting a note
    public boolean deleteNoteById(int id) {
        return notes.removeIf(note -> note.getId() == id);
    }

    // Updating a note
    public boolean updateNoteById(int id, Note updatedNote) {
        for (Note note: notes) {
            if (note.getId() == id) {
                note.setTitle(updatedNote.getTitle());
                note.setContent(updatedNote.getContent());
                return true;
            }
        }
        return false;
    }
}
