package personal.model;

public class Note {
    private String id = "";
    private String heading;
    private String text;
    private String check;

    public Note(String heading, String text) {
        this.heading = heading;
        this.text = text;

    }

    public Note(String id, String heading, String text, String check) {
        this(heading, text);
        this.id = id;
        this.check = check;
    }

    public Note(String id, String heading, String text) {
        this(heading, text);
        this.id = id;
    }

    public Note() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }



    @Override
    public String toString() {
        return String.format("Идентафикатор: %s\nЗаголовок: %s\nТекст", id, heading, text);
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }
    //sjd
}
