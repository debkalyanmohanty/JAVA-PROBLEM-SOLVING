package problemsolving;

public class InvertedFullPyramid {
    public static void main(String[] args) {
//        int k=0;
        for (int i=5;i>=1;--i){
            for (int k=1;k<=5-i;++k){
                System.out.print(" ");
            }
            for (int j=i;j<=2*i-1;++j){
                System.out.print("*");
            }
            for (int j=0;j<i-1;++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
