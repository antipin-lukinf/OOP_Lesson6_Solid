package personal.views;

import personal.controllers.NoteController;
import personal.model.Note;

import java.util.List;
import java.util.Scanner;

public class ViewNote {

    private NoteController noteController;

    public ViewNote(NoteController userController) {
        this.noteController = noteController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду: ");
            com = Commands.valueOf(command.toUpperCase());
            if (com == Commands.EXIT) return;
            try {
                switch (com) {
                    case CREATE:
                        String heading = prompt("Заголовок: ");
                        String text = prompt("Текст записки: ");
                        String question = prompt("В каком формате сохранять?(введите 1, для сохранения с ,\n или 2, для сохранения с ;): ");
                        NoteController.saveNote(new Note(heading, text), question);
                        break;
                    case READ:
                        String id = prompt("Идентификатор пользователя: ");

                        Note note = noteController.readNote(id);
                        System.out.println(note);

                        break;
                    case LIST:
                        List<Note> lst = noteController.readNote();
                        lst.forEach(i -> System.out.println(i + "\n"));
                        break;
                    case UPDATE:
                        String numId = prompt("Какой контакт редактировать? Введите номер ID: ");
                        noteController.idPresenceValidation(numId);
                        noteController.updNote(numId, createAGuy());
                        break;
                    case DELETE:
                        String delNumId = prompt("Какой контакт удалять? Введите номер ID: ");
                        noteController.idPresenceValidation(delNumId);
                        noteController.delNote(delNumId);
                        break;


                }
            } catch (Exception e) {
                System.out.println("Oopsie!\n"+e.getMessage());;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private Note createAGuy() {
        String heading = prompt("Заголовок: ");
        String text = prompt("Текст записки: ");

        Note newGuy = new Note(heading, text);
        return newGuy;
    }

}
