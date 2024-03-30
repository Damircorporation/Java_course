import java.util.Objects;

public class Laptop {
    int ram;
    int storageSize;
    String os;
    String color;

// Выводим всю инфу что имеем
    public String toString(){
        return "ram :" + ram + ", storageSize :"+ storageSize + ", os :"+ os + ", color :"+ color; 
    }

    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Laptop laptop) {
            return storageSize == laptop.storageSize && ram == laptop.ram && os.equals(laptop.os)&& color.equals(laptop.color);   
        }
        return false;
    }
    
// сравниваем по ХэшКоду
    public int hashCode(){ 
        return storageSize+ram+11*os.hashCode()+17*color.hashCode();
    }
}