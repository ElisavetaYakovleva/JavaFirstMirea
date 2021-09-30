package Lab2;

public class TestHuman {
        public static void main(String[] args) {
            Human First = new Human("Отис", 190, 45);
            System.out.println("Человек 1: " + First.getName() + "\n" +"Возраст: "+
                    First.getHeight() + "\n" +"Возраст: "+ First.getYears()+"\n");
            First.setName("Петр");
            First.setYears(21);
            System.out.println("\nЧеловек 2: " + First.getName() + "\n" +"Автор: "+
                    First.getHeight() + "\n" +"Возраст: "+ First.getYears()+"\n");
        }
    }

