package ru.mirea.task22;
import java.util.Scanner;
enum AdditService {
    Credits(1), Balance(2), MobileBank(3), SMSAlerts(4);
    private int numb;
    AdditService(int numb) {
        this.numb = numb;
    }
    int getNumb() {
        return numb;
    }
}

public class TF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdditService adServ;
        System.out.println("Выберите один из банковских услуг");
        System.out.println("1 - Задолженности");
        System.out.println("2 - Баланс");
        System.out.println("3 - Мобильный банк");
        System.out.println("4 - SMS-оповещения");
        int n = scanner.nextInt();
        adServ = switch (n){
            case 1 -> AdditService.Credits;
            case 2 -> AdditService.Balance;
            case 3 -> AdditService.MobileBank;
            case 4 -> AdditService.SMSAlerts;
            default -> null;
        };
        System.out.println(adServ);
    }
}
