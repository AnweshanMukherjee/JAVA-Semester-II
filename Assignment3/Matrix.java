//Question10
//Generalized program
class Matrix{
    public static void main(String[] args) {
        int l = (int)Math.sqrt(args.length);
        int ar[][] = new int[l][l], pos=0;
        for(int i=0;i<ar.length;i++)
            for(int j=0;j<ar.length;j++)
                ar[i][j] = Integer.parseInt(args[pos++]);
        System.out.println("Matrix");
        displayMatrix(ar);
        if(ifUpperTriangular(ar))
            System.out.println("\nUpper Triangular");
        else if(ifLowerTriangular(ar))
            System.out.println("\nLower Triangular");
        else
            System.out.println("Neither Upper Triangular nor Lower Triangular");
        System.out.println("Determinant of the matrix = "+getDeterminant(ar));
    }
    public static boolean ifUpperTriangular(int ar[][]){
        boolean b = true;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                if(i<=j && ar[i][j]==0)
                    b = false;
                else if(i>j && ar[i][j]!=0)
                    b = false;
            }
        }
        return b;
    }
    public static boolean ifLowerTriangular(int ar[][]){
        boolean b = true;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                if(i<j && ar[i][j]!=0)
                    b = false;
                else if(i>=j && ar[i][j]==0)
                    b = false;
            }
        }
        return b;
    }
    public static void displayMatrix(int ar[][]){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++)
                System.out.print(ar[i][j]+" ");
            System.out.println();
        }
    }
    public static int getDeterminant(int ar[][]){
        if(ar.length==1)
            return ar[0][0];
        if(ar.length==2)
            return (ar[0][0]*ar[1][1] - ar[0][1]*ar[1][0]);
        int x = 0;
        for(int i=0;i<ar.length;i++){
            x += Math.pow(-1,i)*ar[0][i]*getDeterminant(getSubDeterminant(ar,0,i));
        }
        return x;
    }
    public static int[][] getSubDeterminant(int ar[][], int i1, int j1){
        int ar1[][] = new int[ar.length-1][ar.length-1];
        int posX = 0, posY = 0;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                if(i!=i1 && j!=j1){
                    ar1[posX][posY] = ar[i][j];
                    if(posY<ar1.length-1)
                        posY++;
                    else if(posY==ar1.length-1){
                        posX++;
                        posY = 0;
                    }
                }
            }
        }
        return ar1;
    }
}
