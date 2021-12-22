package ru.mirea.task21;
import java.util.ArrayList;
public class TG {
    static ArrayList<BS> bankServices = new ArrayList<>();

    static public void printList(ArrayList<BS> bs) {
        for(int i = 0; i < bs.size(); i++) {
            System.out.println(bs.get(i).accountNumb);
        }
    }
    public static void main(String[] args) {
        BP bp = BP.Deposit;
        AddSer as = AddSer.MobileBank;
        BS bServ1 = new BS(120, bp, as);
        bankServices.add(bServ1);
        BS bServ2 = new BS(34, bp, as);
        bankServices.add(bServ2);
        printList(bankServices);
    }
}
