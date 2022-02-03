package problemsolving;
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        int n=sc.nextInt();
        int num=n;
        int reverse=0,d;
        while(n!=0){
            d=n%10;
            reverse=reverse*10+d;
            n=n/10;


        }
        if (num==reverse){
            System.out.println(num+" IS PALINDROME NUMBER");
        }
        else{
            System.out.println(num+" IS NOT PALINDROME NUMBER");
        }
    }
}
