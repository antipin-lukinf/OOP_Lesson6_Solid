package personal.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private NoteMapper mapper = new NoteMapper();
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<Note> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            if (line.equals("")) {
                return notes;        }
            notes.add(mapper.mapToComma(line));
        }
        return notes;
    }

    @Override
    public String createNote(Note note, String command) {

        List<Note> notes = getAllNotes();
        int max = 0;
        for (Note item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setId(id);
        note.setCheck(command);
        notes.add(note);
        writeDown(notes);
        return id;
        // gjhghjg
    }

    @Override
    public void updNote(Note note) {
        List<Note> notes = getAllNotes();
        Note target = notes.stream().filter(i -> i.getId().equals(note.getId())).findFirst().get();
        target.setHeading(note.getHeading());
        target.setText(note.getText());
        writeDown(notes);
    }

    @Override
    public void delitNote(String id) {
        List<Note> notes = getAllNotes();
        Note target = notes.stream().filter(i -> i.getId().equals(id)).findFirst().get();
        notes.remove(target);
        writeDown(notes);


    }

    private void writeDown(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note item : notes) {
            if (item.getCheck().equals("1")) {
                lines.add(mapper.mapToComma(item));
            } else {
                lines.add(mapper.map(item));
            }
        }
        fileOperation.saveAllLines(lines);
    }
}
