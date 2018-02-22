package Homework_8_3;

/**
 * Created by osads on 22.02.2018.
 */
public class DocumentWorker {
    public String string;

    public DocumentWorker() {
    }

    public DocumentWorker(String string) {
        this.string = string;
    }

    public void OpenDocument(){
        System.out.println("Документ открыт");
    }

    public void EditDocument(){
        System.out.println("Редактирование документа доступно в версии Про");
    }

    public void SaveDocument(){
        System.out.println("Сохранение документа доступно в версии Про");
    }
}
