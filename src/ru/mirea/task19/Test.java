package ru.mirea.task19;

public class Test {
    static Client c= new Client("Piterson", 0, 3);
    static void testAccountNumb() throws Exception {
        c.accountNumb -= 1;
        if (c.accountNumb < 0)
            throw new Exception("Номер счёта - отрицательное число!");
        System.out.println(c.accountNumb);

    }

    public static void main(String[] args) {
        try {
            testAccountNumb();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
