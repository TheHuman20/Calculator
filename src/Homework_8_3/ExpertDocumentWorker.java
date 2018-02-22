package Homework_8_3;

import kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat;

/**
 * Created by osads on 22.02.2018.
 */
public class ExpertDocumentWorker extends ProDocumentWorker{

    @Override
    public void SaveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }

    public void SuperSpecialMethod(){
        System.out.println("Super!");
    }
}
