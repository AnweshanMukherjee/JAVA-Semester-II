//Question3
class SortLengths{
    public static void main(String[] args) {
        System.out.println("Original array:");
        displayArray(args);
        sortLength(args);
        System.out.println("Sorted array in ascending order of lengths: ");
        displayArray(args);
    }
    public static void sortLength(String ar[]){
        String temp;
        int pos;
        for(int i=0;i<ar.length-1;i++){
            pos = i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[pos].length()>ar[j].length())
                    pos = j;
            }
            temp = ar[pos];
            ar[pos] = ar[i];
            ar[i] = temp;
        }
    }
    public static void displayArray(String ar[]){
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+" ");
        System.out.println();
    }
}
