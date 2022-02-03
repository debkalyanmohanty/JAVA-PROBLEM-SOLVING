package problemsolving;
import java.util.*;
public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER : ");
        int a=sc.nextInt();
        System.out.println("ENTER SECOND NUMBER : ");
        int b=sc.nextInt();
        System.out.println("ENTER THE OPERATOR : ");
        String op=sc.next();
        switch(op){
            case "+":
                System.out.println( a+b);
                break;
            case "-":
                               System.out.println( a-b);
                break;


            case "*":
                       System.out.println(a*b);
                break;


            case "/":
                               System.out.println(a/b);
                break;


        }
    }
}
