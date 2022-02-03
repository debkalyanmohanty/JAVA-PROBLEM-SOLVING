package problemsolving;

import java.util.Scanner;

public class FactorialUsingRecursion {
    static int fact(int num){
        if(num>=1)
            return num * fact(num-1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        int n=sc.nextInt();
        long factorial=fact(n);
        System.out.printf("%d ! = %d",n,factorial);

    }
}
