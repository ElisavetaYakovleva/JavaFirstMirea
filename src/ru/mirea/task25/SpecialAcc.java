package ru.mirea.task25;

public class SpecialAcc implements BA{
    private BA bankAcc;
    private String service;
    private int proc;

    public SpecialAcc(BA bankAcc, String service, int proc) {
        this.bankAcc = bankAcc;
        this.service = service;
        this.proc = proc;
    }

    @Override
    public double getAccount() {
        return bankAcc.getAccount() + (bankAcc.getAccount() * proc)/100;
    }

    @Override
    public String getService() {
        return this.service + bankAcc.getService();
    }
}
