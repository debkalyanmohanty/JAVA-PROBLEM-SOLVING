package problemsolving;

import java.util.Scanner;

public class RemovingSymbols {
    static String removeSpecialChar(String str){
        str=str.replaceAll("[^a-zA-Z0-9]","");
        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(removeSpecialChar(str));

    }
}
