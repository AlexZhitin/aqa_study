package Basic.L3_hw3;

public class ExpertDocumentWorker extends ProDocumentWorker {

    @Override
    protected void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}