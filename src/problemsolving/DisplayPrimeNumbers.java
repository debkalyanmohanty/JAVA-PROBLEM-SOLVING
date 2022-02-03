package problemsolving;
import java.util.*;

public class DisplayPrimeNumbers {
    static void prime(){
        int n,x;
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE FIRST NUMBER: ");
        n=sc.nextInt();
        System.out.print("ENTER THE SECOND NUMBER: ");
        x=sc.nextInt();
        int i,j,count;
        for (i=n;i<=x;i++){
            if (i==1||i==0){
                continue;
            }
            count=1;
            for (j=2;j<=i/2;j++){
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
    public static void main(String[] args) {
        prime();
    }
}
