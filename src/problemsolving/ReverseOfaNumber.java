package problemsolving;
import java.util.*;
public class ReverseOfaNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER TO BE REVERSED : ");
        int num=sc.nextInt();
        int r=0,d;
   while(num!=0) {
       d = num % 10;
       r = r*10 + d;
       num = num / 10;
   }
        System.out.println("THE REVERSE OF A NUMBER IS : "+ r);
    }
}
