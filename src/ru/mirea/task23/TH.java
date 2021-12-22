package ru.mirea.task23;

public class TH {
    public static void main(String[] args) {
        Client cl1 = new Client("Тома", 23, 124);
        Client cl2 = new Client("Сергей", 334, 16);
        Client cl3 = new Client("Владислав", 98, 190);

        System.out.println("Проверка "+cl1.name+" и "+cl3.name+" на равенство");
        System.out.println(cl1.equals(cl3));

        System.out.println("Сравним "+cl1.name+" и "+cl1.name);
        System.out.println(cl2.equals(cl2));

        System.out.println("Вывод хешов клиентов");
        System.out.println(cl1.hashCode());
        System.out.println(cl2.hashCode());
        System.out.println(cl3.hashCode());
    }
}
