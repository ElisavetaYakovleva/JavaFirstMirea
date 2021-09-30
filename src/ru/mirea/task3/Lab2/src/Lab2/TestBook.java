package Lab2;

public class TestBook {
    public static void main(String[] args) {
        Book First = new Book("Библия", "Сам Иисус", 0, 1217);
        System.out.println("Книжка 1: " + First.getName() + "\n" +"Автор: "+
                First.getAuthor() + "\n" +"Год: "+ First.getYear()+"\n"+"Кол-во страниц: "+
                First.getNumber_of_pages());
        First.setName("Священное писание");
        First.setYear(2001);
        First.setNumber_of_pages(1130);
        System.out.println("\nКнижка 2: " + First.getName() + "\n" +"Автор: "+
                First.getAuthor() + "\n" +"Год: "+ First.getYear()+"\n"+"Кол-во страниц: "+
                First.getNumber_of_pages());
    }
}
