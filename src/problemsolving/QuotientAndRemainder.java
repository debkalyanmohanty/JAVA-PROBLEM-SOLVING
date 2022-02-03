package problemsolving;
import java.util.*;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE DIVISOR : ");
        int divisor=sc.nextInt();
        System.out.println("ENTER THE DIVIDEND : ");

        int dividend=sc.nextInt();
        System.out.println("THE QUOTIENT IS : "+ dividend/divisor);
        System.out.println("THE REMAINDER IS : "+ dividend%divisor);
    }
}
