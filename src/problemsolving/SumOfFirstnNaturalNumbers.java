package problemsolving;
import java.util.*;

public class SumOfFirstnNaturalNumbers {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF n NUMBERS : ");
        int n = sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
           sum+=i;
        }
        System.out.println("THE SUM OF FIRST n NATURAL NUMBERS IS : "+ sum);


    }
}
