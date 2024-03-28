
public class Cat {
    int age;
    String name;
    String owner;
    boolean sterilization;
    String color;

    public String toString(){
        return "name :" + name + ", age :"+ age + ", owner :"+ owner + ", color :"
        + color + ", sterilization :"+ sterilization; 
    }
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj instanceof Cat cat) {
            return age == cat.age && name.equals(cat.name) && owner.equals(cat.owner)&&
            sterilization == cat.sterilization && color.equals(cat.color);   
        }
        return false;
    }
}