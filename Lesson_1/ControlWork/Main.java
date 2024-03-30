// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map.
// Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// 5 - поиск
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно
// также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1. ram = 8;
        laptop1. storageSize = 512;
        laptop1. os = "Windows";
        laptop1. color = "Silver";

        Laptop laptop2 = new Laptop();
        laptop2. ram = 16;
        laptop2. storageSize = 1024;
        laptop2. os = "MacOS";
        laptop2. color = "Space Gray";

        Laptop laptop3 = new Laptop();
        laptop3. ram = 8; 
        laptop3. storageSize = 256;
        laptop3. os = "Windows";
        laptop3. color = "Black";

        Laptop laptop4 = new Laptop();
        laptop4. ram = 16;
        laptop4. storageSize = 1024;
        laptop4. os = "Windows";
        laptop4. color = "White";

        Laptop laptop5 = new Laptop();
        laptop5. ram = 8;
        laptop5. storageSize = 256;
        laptop5. os = "Linux";
        laptop5. color = "Black";

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);

        printSet(laptops);

        System.out.println();
        printSet(findByColor("White", laptops));
    }

// Ищем котика по нужному цвету
    static Set<Laptop> findByColor(String color, Set<Laptop> laptops){
        Set<Laptop> res = new HashSet<>();
        for (Laptop laptop:laptops){
            if (laptop.color.equals(color)){
                res.add(laptop);
            }
        }
        return res;
    } 

// Создаем множество в котором будем хранить экземпляры класса Set
    static void printSet(Set<Laptop> laptops){
        for (Laptop laptop: laptops){
            System.out.println(laptop);
        }
    }

    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Ввод вопроса");
    // String answer = scanner.nextLine();
    // while (!answer.equals("5")){

    // }

}
