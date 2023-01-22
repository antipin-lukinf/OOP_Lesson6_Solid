package personal.model;

public class NoteMapper {
    public String map(Note note) {
        return String.format("%s;%s;%s;%s;", note.getId(), note.getHeading(), note.getHeading(), note.getCheck());
    }

    public String mapToComma (Note note) {
        return String.format("%s,%s,%s,%s", note.getId(), note.getHeading(), note.getHeading(), note.getCheck());
    }

    public Note map(String line) {
        String[] lines = line.split("[;]");
        return new Note(lines[0], lines[1], lines[2], lines[3]);
    }

    public Note mapToComma(String line) {
//        if(line.equals("")){
//            return new Note();
//        }
        String[] lines = line.split("[,;]");
        return new Note(lines[0], lines[1], lines[2], lines[3]);

    }
}
