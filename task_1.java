import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
 * методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или
 * критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
 * Критерии фильтрации можно хранить в Map. Например: “Введите цифру,
 * соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев -
 * сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
 * условиям.
 */

public class task_1 {
    public static void main(String[] args) {
        Laptops laptop1 = new Laptops(16, "INTEL", 16, 512, "HUAWEI", "grey", 69990);
        Laptops laptop2 = new Laptops(15.6, "INTEL", 8, 256, "HUAWEI", "silver", 46990);
        Laptops laptop3 = new Laptops(17.3, "INTEL", 8, 512, "MSI", "whiye", 89990);
        Laptops laptop4 = new Laptops(14, "AMD", 16, 512, "MSI", "black", 58990);
        Laptops laptop5 = new Laptops(16.1, "AMD", 16, 1024, "ADATA XPG", "black", 125990);
        Laptops laptop6 = new Laptops(15.6, "AMD", 16, 512, "ASUS", "blue", 75990);
        Laptops laptop7 = new Laptops(16, "AMD", 8, 512, "LENOVO", "grey", 72990);
        Laptops laptop8 = new Laptops(17.3, "INTEL", 32, 2048, "MSI", "grey", 282990);
        Laptops laptop9 = new Laptops(16.1, "AMD", 8, 512, "HP", "blue", 116290);

        Set<Laptops> set = new HashSet<>();
        set.add(laptop1);
        set.add(laptop2);
        set.add(laptop3);
        set.add(laptop4);
        set.add(laptop5);
        set.add(laptop6);
        set.add(laptop7);
        set.add(laptop8);
        set.add(laptop9);
        System.out.println("Список имеющихся ноутбуков");
        for (Laptops l : set) {
            System.out.println(l);
        }
        task1(set);
    }

    public static void task1(Set<Laptops> set) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> filterCiteria1 = new HashMap<>();
        Map<Integer, Integer> filterCiteria2 = new HashMap<>();
        System.out.println("Введите параметр поиска");
        System.out.println("1. Диагональ экрана");
        System.out.println("2. Процессор");
        System.out.println("3. ОЗУ");
        System.out.println("4. Объем ЖД");
        System.out.println("5. Производитель");
        System.out.println("6. Цвет");
        System.out.println("7. Цена");
        System.out.println("Введите значение параметра (Диагональ экрана) -> ");
        String screenSize = scanner.nextLine();
        filterCiteria1.put(1, screenSize);
        System.out.println("Введите значение параметра (Процессор) -> ");
        String cpu = scanner.nextLine().toUpperCase();
        filterCiteria1.put(2, cpu);
        System.out.println("Введите значение параметра (ОЗУ) -> ");
        int ram = scanner.nextInt();
        filterCiteria2.put(1, ram);
        System.out.println("Введите значение параметра (Объем ЖД) -> ");
        int storage = scanner.nextInt();
        filterCiteria2.put(2, storage);
        System.out.println("Введите значение параметра (Производитель) -> ");
        String brand = scanner.nextLine().toUpperCase();
        filterCiteria1.put(3, brand);
        System.out.println("Введите значение параметра (Цвет) -> ");
        String colour = scanner.nextLine().toLowerCase();
        filterCiteria1.put(4, colour);
        System.out.println("Введите значение параметра (Цена) -> ");
        int price = scanner.nextInt();
        filterCiteria2.put(3, price);
        for (Laptops laptop : set) {
            if (laptop.getScreenSize() >= Double.parseDouble(filterCiteria1.get(1))
                    && (laptop.getCPU() == filterCiteria1.get(2)) && (laptop.getRAM() >= filterCiteria2.get(1))
                    && (laptop.getStorage() >= filterCiteria2.get(2)) && (laptop.getBrand() == filterCiteria1.get(3)) &&
                    (laptop.getColour() == filterCiteria1.get(4)) && (laptop.getPrice() >= filterCiteria2.get(3))) {
                System.out.println(laptop);
            }
        }
        scanner.close();
    }
}
