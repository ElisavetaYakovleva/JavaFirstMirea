package ru.mirea.task26;

public class USD extends M{
    public USD(){
        this.convStrategy = new USDConvert();
    }
}
