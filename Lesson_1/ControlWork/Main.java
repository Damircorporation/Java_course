// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map.
// Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет
// 5 - поиск
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно
// также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Dell", 16, 512, "Windows", "Black"));
        laptops.add(new Laptop("Apple", 8, 256, "MacOS", "Silver"));
        laptops.add(new Laptop("Lenovo", 32, 1024, "Windows", "Gray"));
        laptops.add(new Laptop("Samsung", 16, 1024, "MacOS", "Gray"));
        laptops.add(new Laptop("Lenovo", 32, 512, "Linux", "Black"));

        Map<String, Object> filters = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        System.out.println("5 - Поиск");

        int choice;
        while (true) {
            choice = scanner.nextInt();
            if (choice == 5) {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Введите минимальный объем ОЗУ");
                    filters.put("ram", scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Введите минимальный объем ЖД");
                    filters.put("hdd", scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Введите необходимую операционную систему");
                    filters.put("os", scanner.next());
                    break;
                case 4:
                    System.out.println("Введите необходимый цвет");
                    filters.put("color", scanner.next());
                    break;
                default:
                    System.out.println("Неверный ввод критерия. Попробуйте снова.");
            }
        }

        Set<Laptop> filteredLaptops = laptops.stream()
                .filter(laptop -> filters.getOrDefault("ram", 0) instanceof Integer && laptop.ram >= (int) filters.getOrDefault("ram", 0))
                .filter(laptop -> filters.getOrDefault("hdd", 0) instanceof Integer && laptop.hdd >= (int) filters.getOrDefault("hdd", 0))
                .filter(laptop -> filters.getOrDefault("os", "").equals("") || laptop.os.equalsIgnoreCase((String) filters.getOrDefault("os", "")))
                .filter(laptop -> filters.getOrDefault("color", "").equals("") || laptop.color.equalsIgnoreCase((String) filters.getOrDefault("color", "")))
                .collect(Collectors.toSet());

        System.out.println("Вам подходит ноутбук:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
    }
}