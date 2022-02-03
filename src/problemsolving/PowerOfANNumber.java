package problemsolving;

import java.util.Scanner;

public class PowerOfANNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE BASE : ");
        int b=sc.nextInt();
        System.out.println("ENTER THE EXPONENT : ");
        int e=sc.nextInt();
        long result=1;
        while(e!=0){
            result*=b;
            --e;
        }
        System.out.println("THE ANSWER IS " + result);
    }
}
