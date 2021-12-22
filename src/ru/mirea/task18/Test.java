package ru.mirea.task18;

public class Test {
    static Client c;
    static void testAccountNumb(int n) {
        try{
            c.accountNumb = n;
            if(n < 0) throw new RuntimeException("Ошибка баланса");
        }finally {
            System.out.println("Произошла ошибка баланса! Баланс не иожет быть отрицательным!");
        }
    }

    static void doubleEx () {
        try {
            int numb = 0;
            int k = 5/numb;
        } catch (ArithmeticException e) {
            System.out.println("ОШИБКА\nДеление на ноль: " + e);
        }
        System.out.println("\nВсе ошибки обработаны!");
    }

    public static void main(String[] args) {
        doubleEx();
    }
}
