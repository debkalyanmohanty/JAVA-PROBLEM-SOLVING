package problemsolving;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        int p = sc.nextInt();
        int count = 0;
        int i=1;
        while(i<=p){
            if (p%i==0){
                count+=1;
            }
            i+=1;
        }
        if (count==2){
            System.out.println(p + " IS A PRIME NUMBER ");
        }
        else{
            System.out.println(p + " IS NOT A PRIME NUMBER ");
        }
//        boolean flag = false;
//  for (int i=2;i<=p/2;i++){
//      if (p%i==0){
//          flag=true;
//          break;
//      }
//    }
//        int i=2;
//while (i<=p/2){
//    if (p%1==0){
//        flag=true;
//        break;
//    }
//    ++i;
//}
//   if (!flag){
//            System.out.println(p + " IS A PRIME NUMBER ");
//        }
//  else{
//            System.out.println(p + " IS NOT A PRIME NUMBER ");
//        }
    }
}
