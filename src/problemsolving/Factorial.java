package problemsolving;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int n =sc.nextInt();
        int fact=1;
        for (int i=1;i<=n;i++) {
            fact *= i;
        }
        System.out.print("THE FACTORIAL VALUE IS : "+ fact);
    }
}
