package Labs;

public class Lab1 {
    public static void main(String[] args){
        int []b = new int [] { 10, 3, 2, 4, 2, 3, 6, 7, 11, 4 };
        for (int i = 0; i<10; i++){
            System.out.print(b[i]);
        }
        System.out.print("\n");
        System.out.println("Вывод с for прошел");
        int i = 0;
        while (i < 10){
            System.out.print(b[i]);
            i++;
        }
        System.out.print("\n");
        int n = 0;
        System.out.println("Вывод с while прошел");
        do {
            System.out.print(b[n]);
            n++;
        }while (n < 9);
        System.out.print("\n");
        System.out.println("Вывод с do-while прошел");
    }
}
