package problemsolving;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class SumOfDigitsOfAGivenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int num=sc.nextInt();
        int sum=0,digit;
        while(num!=0){
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("SUM OF DIGITS IS : "+ sum);
    }
}
