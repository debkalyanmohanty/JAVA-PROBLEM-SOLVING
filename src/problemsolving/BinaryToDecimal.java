package problemsolving;

import java.util.Scanner;

public class BinaryToDecimal {
    static int binaryTodecimal(long bn){
        int dn=0,i=0;
        long remainder;
        while(bn!=0){
            remainder=bn%10;
            bn/=10;
            dn+=remainder*Math.pow(2,i);
            ++i;
        }
        return dn;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE BINARY NUMBER : ");
        long rn=sc.nextLong();
        int decimal=binaryTodecimal(rn);
        System.out.println("BINARY TO DECIMAL");
        System.out.println(rn + " = "+ +decimal);
    }
}
