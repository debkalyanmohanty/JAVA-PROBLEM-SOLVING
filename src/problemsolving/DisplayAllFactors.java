package problemsolving;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
public class DisplayAllFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int num=sc.nextInt();
        int i,sum=0;
        System.out.printf("THE FACTORS OF %d ARE : ",num);
       for (i=1;i<=num;i++){
           if (num%i==0){
               System.out.print(i + "\t");

           }


       }
    }
}
