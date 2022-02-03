package problemsolving;

import java.util.Scanner;

public class AverageOfAnArray {
    public static void main(String[] args) {
        int [] marks = new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<marks.length;i++){
            System.out.printf("ENTER THE NUMBER %d : ",i+1);
            marks[i]=sc.nextInt();
        }
        double sum =0.0;
        for (double num : marks ){
            sum+=num;
        }
        System.out.println("THE AVERAGE OF THE ARRAY IS : " + sum/ marks.length);

    }
}
