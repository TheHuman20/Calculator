package Homework_8_3;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DocumentWorker documentWorker;
        String s = " ";
        do {
            s = scanner.nextLine();
            switch (s) {
                case "user":
                    documentWorker = new DocumentWorker();
                    documentWorker.OpenDocument();
                    documentWorker.EditDocument();
                    documentWorker.SaveDocument();
                    break;
                case "pro":
                    documentWorker = new ProDocumentWorker();
                    documentWorker.OpenDocument();
                    documentWorker.EditDocument();
                    documentWorker.SaveDocument();
                    break;
                case "expert":
                    documentWorker = new ExpertDocumentWorker();
                    documentWorker.OpenDocument();
                    documentWorker.EditDocument();
                    documentWorker.SaveDocument();
                    break;
                default:
                    System.out.println("Неверный ввод");
                    break;
            }
        } while (true);
    }
}
