import java.util.HashSet;
import java.util.Set;

public class Main {
    // public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1. name = "Мурка";
        cat1. age = 10;
        cat1. owner = "Олег";
        cat1. color = "Рыжий";
        cat1. sterilization = false;

        Cat cat2 = new Cat();
        cat2. name = "Васька";
        cat2. age = 9;
        cat2. owner = "Петр";
        cat2. color = "Белый";
        cat2. sterilization = false;

        Cat cat3 = new Cat();
        cat3. name = "Толик";
        cat3. age = 8;
        cat3. owner = "Татьяна";
        cat3. color = "Черный";
        cat3. sterilization = true;

        Cat cat4 = new Cat();
        cat4. name = "Чижик";
        cat4. age = 11;
        cat4. owner = "Алина";
        cat4. color = "Рыжий";
        cat4. sterilization = true;

        Cat cat5 = new Cat();
        cat5. name = "Чижик";
        cat5. age = 12;
        cat5. owner = "Алина";
        cat5. color = "Рыжий";
        cat5. sterilization = true;

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        printSet(cats);

        System.out.println();
        printSet(findByColor("Белый", cats));
    }

// Ищем котика по нужному цвету
    static Set<Cat> findByColor(String color, Set<Cat> cats){
        Set<Cat> res = new HashSet<>();
        for (Cat cat:cats){
            if (cat.color.equals(color)){

            }
        }
        return res;
    } 

// Создаем множество в котором будем хранить экземпляры класса Set
    static void printSet(Set<Cat> cats){
        for (Cat cat: cats){
            System.out.println(cat);
        }
    }
}
