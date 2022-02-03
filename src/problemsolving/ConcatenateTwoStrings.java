package problemsolving;

import java.util.Scanner;

public class ConcatenateTwoStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=sc.nextLine();
//        System.out.println(str + str2);
        String str3=str.concat(str2);
        System.out.println(str3);
    }
}
