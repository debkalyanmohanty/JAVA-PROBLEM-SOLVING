package problemsolving;
import java.util.*;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE COEFFICIENT OF x^2 : " );
        int a=sc.nextInt();
        System.out.println("ENTER THE COEFFICIENT OF x : " );
        int b=sc.nextInt();
        System.out.println("ENTER THE COEFFICIENT OF CONSTANT: " );
        double c=sc.nextInt();
        double D=(b*b)-(4*a*c);
        double alpha=(-b+ Math.sqrt(D))/(2*a);
        double beta=(-b-Math.sqrt(D))/(2*a);

        System.out.println("THE ROOTS ARE " + alpha+ " " + beta);
        System.out.println("THE DISCRIMINANT IS "+ D);

    }
}
