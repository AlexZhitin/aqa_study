package Basic.L3_hw2;

/*Создать класс, представляющий учебный класс ClassRoom.
Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и переопределите каждый из методов,
в зависимости от успеваемости ученика.
Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать, отдыхать.*/

public class ClassRoom {
    Pupil pupil;
    Pupil pupil1;
    Pupil pupil2;
    Pupil pupil3;
    Pupil[] pupils;

    public ClassRoom(Pupil pupil, Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupil = pupil;
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupils = new Pupil[4];

        pupils[0] = pupil;
        pupils[1] = pupil1;
        pupils[2] = pupil2;
        pupils[3] = pupil3;
    }

    public ClassRoom(Pupil pupil, Pupil pupil1) {
        this.pupil = pupil;
        this.pupil1 = pupil1;
        this.pupils = new Pupil[2];

        pupils[0] = pupil;
        pupils[1] = pupil1;
    }

    public static void main(String[] args) {

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

        ClassRoom b = new ClassRoom(pupil, pupil1);
        for (Pupil i : b.pupils) {
            i.read();
            i.write();
            i.study();
            i.relax();
        }
    }
}