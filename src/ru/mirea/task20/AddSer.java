package ru.mirea.task20;

public enum AddSer {
    Commission(1), Insurance(2), MobileBank(3), SMSAlerts(4);
    private int numb;
    AddSer(int numb) {
        this.numb = numb;
    }
    int getNumb() {
        return numb;
    }
}
