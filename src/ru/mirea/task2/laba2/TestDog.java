package ru.mirea.task2.laba2;

public class TestDog {
    public static void main(String[] args) {
        Dog c = new Dog("Густаф", 8);
        System.out.println(c.ToString());
        Dog c1 = new Dog("Песель", 3);
        System.out.println(c1.ToString());
        Dog c3 = new Dog("Тапочка", 6);
        System.out.println(c3.ToString());
    }
}
