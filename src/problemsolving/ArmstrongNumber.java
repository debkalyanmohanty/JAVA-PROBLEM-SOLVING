package problemsolving;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER  : ");
        int n=sc.nextInt();
        int r,c,sum=0;
        int num=n;
        while(n>0){
            r =n%10;
            c=r*r*r;
            sum=sum+c;
            n=n/10;

        }
        if (num==sum){
            System.out.println(num + " IS A ARMSTRONG NUMBER ");
        }
        else {
            System.out.println(num + " IS NOT A ARMSTRONG NUMBER ");
        }
    }
}
