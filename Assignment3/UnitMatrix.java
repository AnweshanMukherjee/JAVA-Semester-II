//Question9
class UnitMatrix{
    public static void main(String[] args) {
        int ar[][] = new int[3][3], pos = 0;
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                ar[i][j] = Integer.parseInt(args[pos++]);
        System.out.println("Matrix: ");
        displayMatrix(ar);
        if(ifUnitMatrix(ar))
            System.out.println("Unit Matrix");
        else
            System.out.println("Not an Unit Matrix");
    }
    public static boolean ifUnitMatrix(int ar[][]){
        boolean b = true;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                if(ar[i][j]==1 && i!=j)
                    b = false;
                if(ar[i][j]==0 && i==j)
                    b = false;
            }
        }
        return b;
    }
    public static void displayMatrix(int ar[][]){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
