package problemsolving;

import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE YEAR : ");
long Year=sc.nextLong();
if (Year%4==0 || Year%100!=0 && Year%400==0){
    System.out.printf("%d IS A LEAP YEAR",Year);
}
else{
    System.out.printf("%d IS NOT A LEAP YEAR",Year);
}
    }
}
