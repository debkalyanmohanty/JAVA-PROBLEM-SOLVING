package problemsolving;

public class MatrixAddition {
    public static void main(String[] args) {
        int row=2,column=3;
        int [][] mat = {{20,30,40},{10,20,30}};
        int [][] mat1= {{20,30,40},{10,20,30}};
        int [][] sum =new int[row][column];
for (int i=0;i<row;i++){
    for (int j=0;j<column;j++){
         sum[i][j]=mat[i][j] + mat1[i][j];
    }
}
        System.out.println("SUM OF THE MATRICES ARE : ");
for (int [] rows : sum ){
    for (int columns : rows){
        System.out.print(columns + " ");
    }
    System.out.println();
}
    }
}
