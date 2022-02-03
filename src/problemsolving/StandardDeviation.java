package problemsolving;

import java.util.Scanner;

public class StandardDeviation {
    static double calculateSD(double arr[]){
        double sum=0.0,standardDeviation=0.0;
        int length=arr.length;
        for (double num : arr){
            sum+=num;
        }
        double mean=sum/length;
        for (double num : arr){
            standardDeviation+=Math.pow(num-mean,2);
        }
        return Math.sqrt(standardDeviation/length);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double [] arr=new double [10];
        for (int i=0;i< arr.length;i++){
            System.out.printf("ENTER %d NUMBER : " ,i+1);
            arr[i]=sc.nextInt();
        }
        double sd=calculateSD(arr);
        System.out.println("THE STANDARD DEVIATION IS : "+sd);
    }
}
