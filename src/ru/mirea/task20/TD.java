package ru.mirea.task20;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class TD {
    public static String dateOp(Date date){
        DateFormat dtForm = new SimpleDateFormat("dd.MM.yyyy");
        return dtForm.format(date);
    }
    public static void main(String[] args){
        BP bp = BP.Credit;
        AddSer aServ = AddSer.Insurance;
        BS bServ = new BS(67, bp, aServ);
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        bServ.setOpeningDate(date);
        System.out.println(date);
        System.out.println("Дата открытия " + bServ.productType+" владельца счёта\n "+bServ.accountNumb+": "+bServ.openingDate);
    }
}
