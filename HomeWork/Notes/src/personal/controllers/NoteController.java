package personal.controllers;

import personal.model.Repository;
import personal.model.Note;

import java.util.List;

public class NoteController {
    private Repository repository;

    public NoteController(Repository repository) {
        this.repository = repository;
    }

    public void saveNote(Note note, String command) throws Exception{
        validateNote(note);
        repository.createNote(note, command);
    }

    public void delNote(String id) throws Exception{
        //validateNote(id);
        repository.delitNote(id);
    }

    public Note readNote(String noteId) throws Exception {
        List<Note> notes = repository.getAllNotes();
        for (Note note : notes) {
            if (note.getId().equals(noteId)) {
                return note;
            }
        }

        throw new Exception("Note not found");
    }

    public List<Note> readList() {
        return repository.getAllNotes();
    }

    public void updNote(String idNumber, Note newNote) throws Exception {
        idPresenceValidation(idNumber);
        newNote.setId(idNumber);
        validateNoteId(newNote);
        repository.updNote(newNote);

    }

    private void validateNote(Note note) throws Exception {

        if (note.getHeading().isEmpty()) throw new Exception("Не введен заголовок");
        if (note.getText().isEmpty()) throw new Exception("Не введен текст");



    }
    private void validateNoteId (Note note) throws Exception {
        if (note.getId().isEmpty()) throw new Exception("Note has no id");
        validateNote(note);
    }

    public void idPresenceValidation (String inputId) throws Exception {
        List<Note> notes = repository.getAllNotes();
        for (Note u : notes){
            if(u.getId().equals(inputId))
                return;
        }
        throw new Exception("No such Id here");
    }


}
