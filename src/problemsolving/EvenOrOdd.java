package problemsolving;
import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        int n=sc.nextInt();
        if (n %2==0){
            System.out.println("THE NUMBER ENTERED IS EVEN NUMBER");
        }
        else if (n%2!=0) {
            System.out.println("THE NUMBER ENTERED IS ODD ");
        }
        else{
            System.out.println("ERROR");
        }
    }
}
