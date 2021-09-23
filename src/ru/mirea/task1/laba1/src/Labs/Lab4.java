package Labs;
import java.util.*;
public class Lab4 {
    public static void main(String[] args){
        int a = 1 + (int) (Math.random() * 10 );
        System.out.println(a);
        int[] mass = new int [a];
        for (int i = 0; i < a; i++){
            mass[i] =  1 + (int) (Math.random() * 90 );
        }
        Arrays.sort(mass);
        for (int i = 0; i < a;i++){
            System.out.println(mass[i]);
        }
    }
}
