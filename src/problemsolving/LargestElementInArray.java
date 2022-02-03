package problemsolving;

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int []  marks =new int[5];
for (int i=0;i< marks.length;i++){
    System.out.printf("ENTER THE NUMBER %d : ",i+1);
    marks[i]=sc.nextInt();

}
        int max=marks[0];
        for (int i=0;i<marks.length;i++){
            if (marks[i]>max){
                max=marks[i];
            }
            else{
                max=marks[0];
            }
        }
        System.out.println("THE LARGEST ELEMENT IN THE ARRAY IS : "+max);
    }
}
