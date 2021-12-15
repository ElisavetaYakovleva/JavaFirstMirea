package ru.mirea.task17;
import java.util.Scanner;
enum Products{
    Credit(1), Account(2), Deposit(3), Card(4);
    private int numb;
    Products(int numb) {
        this.numb = numb;
    }
    int getNumb() {
        return numb;
    }
}
public class Enum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Products prod1 = Products.Credit;
        Products prod2 = Products.Card;
        Products prod3;
        System.out.println("Выберите банковский продукт");
        System.out.println("1 - Потребительский кредит");
        System.out.println("2 - Счета");
        System.out.println("3 - Сберегательные депозиты");
        System.out.println("4 - Пластиковые карты");
        int n = scanner.nextInt();
        prod3 = switch (n) {
            case 1 -> Products.Credit;
            case 2 -> Products.Account;
            case 3 -> Products.Deposit;
            case 4 -> Products.Card;
            default -> null;
        };
        System.out.println("Ваши продукты:\n" +
                "1 - " + prod1.name() +
                "\n2 - " + prod2.name());
        if (prod3 != null)
            System.out.println("3 - " + prod3.name());

        System.out.println("\nВсе банковские продукты:");
        for (Products b : Products.values()){
            System.out.println(b.getNumb() + " - " + b);
        }
        System.out.println("Все константы и порядковые значения:");
        System.out.println("\nПрименение метода compareTo():");
        if (prod1.compareTo(prod2) < 0) System.out.println(prod1 + " предшествует " + prod2);
        if (prod1.compareTo(prod2) > 0) System.out.println(prod2 + " предшествует " + prod1);
        if (prod1.compareTo(prod3) == 0) System.out.println(prod1 + " равно " + prod3);

        System.out.println("\nПрименение метода equals():");
        if (prod1.equals(prod2)) System.out.println("Ошибка!");
        if (prod1.equals(prod3)) System.out.println(prod1 + " равно " + prod3);

        System.out.println("\nСравнить на равенство:");
        if (prod1 == prod3) System.out.println(prod1 + " == " + prod3);
    }
}
