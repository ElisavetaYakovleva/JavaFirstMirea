package Labs;
import java.util.Scanner;
public class Lab5 {
    public static void Fact(int n){
        int i = n-1;
        while(i != 0){
            n *= i;
            i--;
        }
        System.out.print(n);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        Fact(n);
    }
}
