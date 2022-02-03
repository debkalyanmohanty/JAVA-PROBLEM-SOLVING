package problemsolving;

import java.util.Scanner;

public class MovingStringNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
for (int i=0;i<str.length();i++){
str=str.replace(str.charAt(i-1),str.charAt(i));}
        System.out.println(str);
    }
}
