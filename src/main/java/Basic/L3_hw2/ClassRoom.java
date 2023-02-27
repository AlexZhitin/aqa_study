package Basic.L3_hw2;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassRoom {

   private ArrayList<Pupil> pupils;

    public ClassRoom(Pupil... pupils) {
       this.pupils = new ArrayList<>(Arrays.asList(pupils));
    }

    public ArrayList<Pupil> getPupils() {
        return pupils;
    }
}