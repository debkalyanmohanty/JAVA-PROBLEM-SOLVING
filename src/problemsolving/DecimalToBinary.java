package problemsolving;

import java.util.Scanner;

public class DecimalToBinary {
//    static int decimalTobinary(int dn){
//        int bn=0;
//        int remainder,i=1;
//        while (dn != 0) {
//remainder=dn%2;
//          dn/=2;
//          bn+=remainder*i;
//          i*=10;
//        }
//        return bn;
//    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("ENTER DECIMAL NUMBER : ");
int dn=sc.nextInt();
//int binary=decimalTobinary(dn);
        String binary=Integer.toBinaryString(dn);
        System.out.println("DECIMAL TO BINARY : ");
        System.out.println(dn+ " = " +binary );
    }
}
