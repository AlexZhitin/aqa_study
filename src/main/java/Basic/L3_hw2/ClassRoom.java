package Basic.L3_hw2;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassRoom {

    public ArrayList<Pupil> getPupils(Pupil... pupils) {
        return new ArrayList<>(Arrays.asList(pupils));
    }
}