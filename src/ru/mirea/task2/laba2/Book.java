package ru.mirea.task2.laba2;

public class Book {
    private String name;
    private int pages;

    public Book(int numbers, String text) {
        name = text;
        pages = numbers;
    }

    public String getNames() {
        return name;
    }

    public int getS() {
        return pages;
    }
}
