package problemsolving;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    static int addNumbers(int  num) {
        if(num!=0)
            return num+addNumbers(num-1);
        else
            return num;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NO. OF TERMS : ");
        int number=sc.nextInt();
        int sum=addNumbers(number);
        System.out.println("Sum = "+sum);
    }
}
