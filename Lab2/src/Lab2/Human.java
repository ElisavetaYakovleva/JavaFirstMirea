package Lab2;

public class Human {
    private String name;
    private int height;
    private int years;
    public Human(String name, int height, int years){
        this.name=name;
        this.height=height;
        this.years=years;
    };
    public void setName(String name){
        this.name=name;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public void setYears(int years){
        this.years=years;
    }
    public int getYears() {
        return years;
    }
    public String getName() {
        return name;
    }
    public int getHeight() {return height; }
}
