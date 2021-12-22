package ru.mirea.task32;

import ru.mirea.task25.BA;

public class CurrentAcc implements BA {
    private String service;
    private double account;

    public CurrentAcc(String service, double account) {
        this.service = service;
        this.account = account;
    }

    @Override
    public double getAccount() {
        return account;
    }

    @Override
    public String getService() {
        return service;
    }
}
