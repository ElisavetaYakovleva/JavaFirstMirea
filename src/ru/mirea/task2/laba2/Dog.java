package ru.mirea.task2.laba2;

public class Dog {
    private String name;
    private int years;
    public Dog(String name, int years){
        this.name=name;
        this.years=years;
    };
    public int getYear() {
        return years;
    }
    public String getName() {
        return name;
    }
    public int ChangeYear(int years){
        return years * 7;
    }
    public String ToString(){
        return ("Имя песика - " + getName()
                + " и его возраст на человечьем равен " + getYear()
                + ", а на великом собачьем - " + ChangeYear(years)
        );
    }
}
