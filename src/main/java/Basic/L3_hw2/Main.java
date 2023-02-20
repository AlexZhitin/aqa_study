package Basic.L3_hw2;

/*Создать класс, представляющий учебный класс ClassRoom.
Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и переопределите каждый из методов,
в зависимости от успеваемости ученика.
Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать, отдыхать.*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       /* ArrayList<Pupil> pupils = new ArrayList<>();
        pupils.add(new Pupil());
        pupils.add(new BadPupil());
        pupils.add(new GoodPupil());
        pupils.add(new ExcellentPupil());*/

        Pupil pupil = new Pupil();
        Pupil pupil1 = new BadPupil();
        Pupil pupil2 = new GoodPupil();
        Pupil pupil3 = new ExcellentPupil();


        ClassRoom a = new ClassRoom(pupil, pupil1, pupil2, pupil3);

        for (Pupil i : a.pupils) {
            i.read();
            i.write();
            i.study();
            i.relax();
        }
    }
}