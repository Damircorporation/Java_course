package family_Tree;

import java.time.LocalDate;
import java.util.List;

public class Human {
    String name;
    LocalDate dob, dod;
    Gender gender;
    Human father, mother;
    List<Human> children;

    public void setMother(Human mother) {
        this.mother = mother;
        
    }
    
}
