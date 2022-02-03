package problemsolving;
import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER WHOSE TABLE IS TO BE PRINTED : ");
        int n=sc.nextInt();
        System.out.println("THE MULTIPLICATION TABLE IS : ");
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d ",n,i,n*i );
            System.out.println();
        }

    }
}
