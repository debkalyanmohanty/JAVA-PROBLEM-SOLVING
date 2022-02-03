package problemsolving;
import java.util.*;
public class SumOfTwoNumbersEnteredByUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER : ");
        int a =sc.nextInt();
        System.out.println("NTER THE SECOND NUMBER : ");
        int b =sc.nextInt();
        int c=a+b;
        System.out.println("THE SUM IS : "+ c);
    }
}
