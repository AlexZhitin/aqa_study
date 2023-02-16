package Basic.L3_hw3;

import Basic.L3_hw3.DocumentWorker;

public class ProDocumentWorker extends DocumentWorker {

    @Override
    protected void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    protected void saveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}