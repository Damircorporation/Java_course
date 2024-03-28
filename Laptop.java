// import java.util.*;
// import java.util.stream.Collectors;

// class Laptop {
//     private int ram;
//     private int storageSize;
//     private String os;
//     private String color;

//     public Laptop(int ram, int storageSize, String os, String color) {
//         this.ram = ram;
//         this.storageSize = storageSize;
//         this.os = os;
//         this.color = color;
//     }

//     // Getters and Setters

//     public static void main(String[] args) {
//         Set<Laptop> laptops = new HashSet<>();
//         laptops.add(new Laptop(8, 512, "Windows", "Silver"));
//         laptops.add(new Laptop(16, 1024, "MacOS", "Space Gray"));
//         laptops.add(new Laptop(8, 256, "Ubuntu", "Black"));

//         Map<String, String> filterCriteria = new HashMap<>();
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Введите цифру, соответствующую необходимому критерию:");
//         System.out.println("1 - ОЗУ");
//         System.out.println("2 - Объем ЖД");
//         System.out.println("3 - Операционная система");
//         System.out.println("4 - Цвет");
//         System.out.println("5 - Поиск");

//         int choice = scanner.nextInt();
//         scanner.nextLine();

//         if (choice == 1) {
//             System.out.println("Введите минимальное количество ОЗУ:");
//             int minRam = scanner.nextInt();
//             filterCriteria.put("ram", String.valueOf(minRam));
//         } else if (choice == 2) {
//             System.out.println("Введите минимальный объем ЖД:");
//             int minStorageSize = scanner.nextInt();
//             filterCriteria.put("storageSize", String.valueOf(minStorageSize));
//         } else if (choice == 3) {
//             System.out.println("Введите операционную систему:");
//             String os = scanner.nextLine();
//             filterCriteria.put("os", os);
//         } else if (choice == 4) {
//             System.out.println("Введите цвет:");
//             String color = scanner.nextLine();
//             filterCriteria.put("color", color);
//         } else if (choice == 5) {
//             // Perform search operation
//         } else {
//             System.out.println("Неверный выбор критерия.");
//             return;
//         }

//         Set<Laptop> filteredLaptops = laptops.stream()
//                 .filter(laptop -> {
//                     boolean match = true;
//                     for (Map.Entry<String, String> entry : filterCriteria.entrySet()) {
//                         if (entry.getKey().equals("ram")) {
//                             if (laptop.getRam() < Integer.parseInt(entry.getValue())) {
//                                 match = false;
//                                 break;
//                             }
//                         } else if (entry.getKey().equals("storageSize")) {
//                             if (laptop.getStorageSize() < Integer.parseInt(entry.getValue())) {
//                                 match = false;
//                                 break;
//                             }
//                         } else if (entry.getKey().equals("os")) {
//                             if (!laptop.getOs().equalsIgnoreCase(entry.getValue())) {
//                                 match = false;
//                                 break;
//                             }
//                         } else if (entry.getKey().equals("color")) {
//                             if (!laptop.getColor().equalsIgnoreCase(entry.getValue())) {
//                                 match = false;
//                                 break;
//                             }
//                         }
//                     }
//                     return match;
//                 })
//                 .collect(Collectors.toSet());

//         if (filteredLaptops.isEmpty()) {
//             System.out.println("Ноутбуков по указанным параметрам не найдено.");
//         } else {
//             System.out.println("Найденные ноутбуки:");
//             for (Laptop laptop : filteredLaptops) {
//                 System.out.println("ОЗУ: " + laptop.getRam() + " ГБ, Объем ЖД: " + laptop.getStorageSize() + " ГБ, ОС: "
//                         + laptop.getOs() + ", Цвет: " + laptop.getColor());
//             }
//         }
//     }
// }