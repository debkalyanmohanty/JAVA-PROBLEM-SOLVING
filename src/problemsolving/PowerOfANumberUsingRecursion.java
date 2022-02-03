package problemsolving;

import java.util.Scanner;

public class PowerOfANumberUsingRecursion {
    static int Power(int b,int e){
        if (e!=0)
            return b*Power(b,e-1);
            else
                return 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE BASE : ");
        int base=sc.nextInt();
        System.out.println("ENTER THE EXPONENT : ");
        int exponent=sc.nextInt();
        int power=Power(base,exponent);
        System.out.println(base + " ^ " +exponent + " = " +power);
    }
}
