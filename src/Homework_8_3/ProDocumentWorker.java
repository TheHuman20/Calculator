package Homework_8_3;

/**
 * Created by osads on 22.02.2018.
 */
public class ProDocumentWorker extends DocumentWorker {

    @Override
    public void EditDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    public void SaveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }

    public void SpecialMethod(){
        System.out.println("LOL!");
    }
}
