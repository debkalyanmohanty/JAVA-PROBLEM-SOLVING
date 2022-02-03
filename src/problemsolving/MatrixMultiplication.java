package problemsolving;

        public class MatrixMultiplication {
            public static void main(String[] args) {
//                int [][] mat=new int [3][6];
                int [][]   mat={{10,20,30},{20,30,40,50,60,70}};
                for (int i=0;i< mat.length;i++){
                    for (int j=0;j<mat.length;j++){
                        mat [i][j]=mat[j][i];
            }
}
              for (int [] r:mat){
                  for (int column :r){
                      System.out.print(column + " ");
                  }
                  System.out.println();
              }

    }
}
