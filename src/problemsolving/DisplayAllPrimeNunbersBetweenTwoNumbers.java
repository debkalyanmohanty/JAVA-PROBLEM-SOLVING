package problemsolving;

import java.util.Scanner;

public class DisplayAllPrimeNunbersBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A : ");
        int a=sc.nextInt();
        System.out.print("ENTER B : ");
        int b=sc.nextInt();
        System.out.printf("THE PRIME NUMBERS BETWEEN %d AND %d ARE : " ,a,b);

        int count;
        for (int i=a;i<=b;i++){
            if (i==1 || i==0){
                continue;

            }
            count=1;
            for (int j=2;j<=i/2;j++){
                if (i%j==0){
                    count=0;
                    break;
                }
            }
            if (count==1){
                System.out.print(i + "\t");
            }
        }
    }
}
