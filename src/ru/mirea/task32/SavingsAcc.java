package ru.mirea.task32;

import ru.mirea.task25.BA;
import ru.mirea.task25.SpecialAcc;

public class SavingsAcc extends SpecialAcc {
    public SavingsAcc(BA bankAcc){
        super(bankAcc, "Проценты по сберегательному счету", 10);
    }
}
