package ru.mirea.task2.laba2;

public class shape {
    private String name;
    private int S;

    public shape(int sm, String text) {
        name = text;
        S = sm;
    }

    public String getNames() {
        return name;
    }

    public int getS() {
        return S;
    }
    public String ToString(){
        return ("Фигура - " + getNames() + " и площадь таки равна " + getS());
    }
}