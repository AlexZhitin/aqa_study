package Basic.L3_hw3;

/*Создайте класс DocumentWorker.
В теле класса создайте три метода openDocument(), editDocument(), saveDocument().
В тело каждого из методов добавьте вывод на экран соответствующих строк: "Документ открыт", "Редактирование документа доступно в версии Про",
"Сохранение документа доступно в версии Про". Создайте производный класс ProDocumentWorker.
Переопределите соответствующие методы, при переопределении методов выводите следующие строки: "Документ отредактирован",
"Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт".
Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker.
Переопределите соответствующий метод. При вызове данного метода необходимо выводить на экран "Документ сохранен в новом формате".
В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp.
Если пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается экземпляр базового класса),
если пользователь ввел номера ключа доступа pro и exp, то должен создаться экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DocumentWorker doc = new DocumentWorker();
        doc.openDocument();
        doc.editDocument();
        doc.saveDocument();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер ключа pro или exp: ");

        String key = sc.next();

        switch (key) {
            case "pro":
                DocumentWorker doc2 = new ProDocumentWorker();
                doc2.editDocument();
                doc2.saveDocument();
                break;
            case "exp":
                DocumentWorker doc3 = new ExpertDocumentWorker();
                doc3.editDocument();
                doc3.saveDocument();
                break;
            default:
                System.out.println("Неправильно введён ключ");
        }
    }
}