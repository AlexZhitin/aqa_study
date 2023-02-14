package Basic.L3_hw3;

public class DocumentWorker {
    protected void openDocument() {
        System.out.println("Документ открыт");
    }

    protected void editDocument() {
        System.out.println("Редактирование документа доступно в версии Про");
    }

    protected void saveDocument() {
        System.out.println("Сохранение документа доступно в версии Про");
    }

    public static DocumentWorker getVersionObject(String version) {
        switch (version) {
            case "pro":
                return new ProDocumentWorker();
            case "exp":
                return new ExpertDocumentWorker();
            default:
                System.out.println("Неправильно введён ключ или не введен. Доступна только бесплатная версия.");
        }
        return new DocumentWorker();
    }
}