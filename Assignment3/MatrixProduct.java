//Question11
class MatrixProduct{
    public static void main(String[] args) {
        int ar1[][] = new int[2][2];
        int ar2[][] = new int[2][2];
        int pos = 0;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                ar1[i][j] = Integer.parseInt(args[pos]);
                ar2[i][j] = Integer.parseInt(args[pos+4]);
                pos++;
            }
        }
        System.out.println("Matrix1: ");
        displayMatrix(ar1);
        System.out.println("\nMatrix2: ");
        displayMatrix(ar2);
        System.out.println("Matrix1 X Matrix2: ");
        displayMatrix(getMatrixProduct(ar1, ar2));
    }
    public static int[][] getMatrixProduct(int ar1[][], int ar2[][]){
        int ar3[][] = new int[ar1.length][ar2[0].length];
        for(int i=0;i<ar3.length;i++)
            for(int j=0;j<ar3[0].length;j++)
                for(int k=0;k<ar2.length;k++)
                    ar3[i][j]+=ar1[i][k]*ar2[k][j];
        return ar3;
    }
    public static void displayMatrix(int ar[][]){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++)
                System.out.print(ar[i][j]+"  ");
            System.out.println();
        }
    }
}
