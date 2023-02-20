package Basic.L3_hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassRoom {

    Pupil pupil;
    Pupil pupil1;
    Pupil pupil2;
    Pupil pupil3;
    Pupil[] pupils;

    public ClassRoom(Pupil...pupils) {
        this.pupils = new Pupil[4];

        pupils[0] = pupil;
        pupils[1] = pupil1;
        pupils[2] = pupil2;
        pupils[3] = pupil3;


    }
}