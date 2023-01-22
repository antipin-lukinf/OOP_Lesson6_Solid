package personal;

import personal.controllers.NoteController;
import personal.model.FileOperation;
import personal.model.FileOperationImpl;
import personal.model.Repository;
import personal.model.RepositoryFile;
import personal.views.ViewNote;

//Написать проект, "Записки", содержащий работу с записками из консоли
//        (можно прочитать все записки, создать одну записку, отредактировать записку,
//        удалить, и прочитать одну записку по ID)
//        , записка содержит в себе как минимум 3 поля Id, заголовок и текст,
//        можно добавить дату. Хранение по вашему выбору, можно в текстовом файле (или каждая записка в одном
//        файле, как вам удобнее). Можно сделать по аналогии с программой из 5 урока.
//        Если все не успеете, то часть задания можно перенести на следующий урок.

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("notes.txt");
        Repository repository = new RepositoryFile(fileOperation);
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote(controller);
        view.run();
    }
}
//hkk