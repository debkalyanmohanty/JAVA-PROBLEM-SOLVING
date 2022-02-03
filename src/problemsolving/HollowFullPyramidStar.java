package problemsolving;

public class HollowFullPyramidStar {
    public static void main(String[] args) {
        int i,j, k=0;
        for ( i=1;i<=5;i++,k=0){
            for ( j=i;j<5;j++){
                System.out.print(" ");
            }
            while(k!=2*i-1){
                if (k==0||k==2*i-2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                k++;
            }
           k=0;
            System.out.println();
        }
        for (i=0;i<=2*5-1;i++){
            System.out.print("*");
        }
    }
}
