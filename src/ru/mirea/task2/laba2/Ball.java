package ru.mirea.task2.laba2;

public class Ball {
    private String color;
    private String material;

    public Ball(String what, String c) {
        color = c;
        material = what;
    }

    public String getNames() {
        return color;
    }

    public String getS() {
        return material;
    }
}
