package problemsolving;
import java.util.*;
public class HcfOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        int a=sc.nextInt();
        System.out.println("ENTER THE NUMBER : ");
        int b=sc.nextInt();
        int hcf=0;
        for (int i=1;i<=a||i<=b;i++){
            if (a%i ==0 && b%i ==0)
                hcf=i;

        }
        System.out.printf("The Hcf OF %d And %d Is %d",a,b,hcf);
    }
}
