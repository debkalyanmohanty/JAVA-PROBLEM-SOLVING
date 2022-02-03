package problemsolving;
import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE THREE NUMBERS : ");
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(n>a && n>b){
            System.out.printf("%d IS THE GREATEST NUMBER",n);
        }
        else if (a>n && a>b){
            System.out.printf("%d IS THE GREATEST NUMBER",a);
        }
        else if (b>a && b>n){
            System.out.printf("%d IS THE GREATEST NUMBER",b);
        }
        else{
            System.out.println("THE NUMBER ENTERED IS INVALID ");
        }
    }
}
