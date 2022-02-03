package problemsolving;

public class PascalsTraingle {
    public static void main(String[] args) {
        int ke=1;
        for (int i=0;i<6;i++){
            for (int k=1;k<=5-i;k++){
                System.out.print(" ");
            }
      for (int j=0;j<=i;j++){
          if (j==0 ||i==0){
              ke=1;
          }
          else{
              ke=ke*(i-j+1)/j;
              System.out.printf("%4d",ke);
          }

      }
            System.out.println();
        }
    }
}
