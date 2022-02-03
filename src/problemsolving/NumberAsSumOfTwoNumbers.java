package problemsolving;
//import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;
public class NumberAsSumOfTwoNumbers {
    static boolean checkPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (checkPrime(i)) {
                if (checkPrime(num - i)) {
                    System.out.printf("%d = %d + %d\n", num, i, num - i);
                    flag = true;
                }
            }

        }

        if (!flag) {
            System.out.println(num + " cannot be expressed as the sum of two prime numbers .");
        }
    }
}
