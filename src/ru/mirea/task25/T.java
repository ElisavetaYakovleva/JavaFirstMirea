package ru.mirea.task25;

public class T {
    public static void main(String[] args) {
        BA acc1 = new CurrentAcc("Текущий счёт", 15789);
        BA acc2 = new CurrentAcc("Дополнительные операции", 5000);
        BA saving = new SavingsAcc(acc2);
        BA cred = new CA(acc2);

        System.out.println("Текущий счёт:");
        System.out.println(acc1.getAccount());
        System.out.println("Депозитный счёт (изначально 6000)");
        System.out.println(saving.getAccount());
        System.out.println("Кредитный счёт (изначально 2000)");
        System.out.println(cred.getAccount());
}}
