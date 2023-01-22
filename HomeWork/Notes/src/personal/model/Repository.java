package personal.model;

import java.util.List;

public interface Repository {
    List<Note> getAllNotes();
    String createNote(Note note, String command);

    void updNote(Note note);

    void delitNote(String id);
}
