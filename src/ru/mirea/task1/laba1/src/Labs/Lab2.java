package Labs;
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество вводимых значений: ");
        int n =in.nextInt();
        int[] massivchik = new int [n];
        System.out.print("Вводите числа: ");
        for (int i = 0; i<n; i++ ){
            massivchik[i] = in.nextInt();
        }
        for (int i = 0; i < n;i++){
            System.out.print(massivchik[i]);
        }
    }
}
