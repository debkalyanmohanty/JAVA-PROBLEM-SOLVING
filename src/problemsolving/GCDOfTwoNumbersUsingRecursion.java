package problemsolving;

import java.util.Scanner;

public class GCDOfTwoNumbersUsingRecursion {
    static int Gcd(int a,int b){
        if (b!=0){
            return Gcd(b,b%a);
        }
        else
            return a;
            }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        int a=sc.nextInt();
        System.out.println("ENTER THE NUMBER : ");

        int b=sc.nextInt();
        int gcd=Gcd(a,b);
        System.out.println("G.C.D OF TWO NUMBERS IS : "+gcd);
    }
}
