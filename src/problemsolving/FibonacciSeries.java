package problemsolving;
import java.util.*;

public class FibonacciSeries {
    public static void  main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER n TILL WHICH THE SEQUENCE WOULD BE PRINTED : ");
        int n= sc.nextInt();
        int a=0, b=1,c;
        System.out.printf("%d %d ", a,b);
        for (int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.printf(" %d ",c);
        }

    }
}
