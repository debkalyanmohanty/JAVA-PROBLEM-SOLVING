package problemsolving;
import java.util.*;

public class VowelOrConsonant {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE CHARACTER : ");
        String Alpha = sc.next();
        if (Alpha.equals("A")||Alpha.equals("E") ||Alpha.equals("I") ||Alpha.equals("O")|| Alpha.equals("U")  ){
            System.out.println("ENTERED CHARACTER IS A VOWEL ");
        }
        else{
            System.out.println("ENTERED CHARACTER IS A CONSONANT");
        }

    }
}
