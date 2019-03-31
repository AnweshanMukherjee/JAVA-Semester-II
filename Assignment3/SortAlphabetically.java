//Question4
class SortAlphabetically{
    public static void main(String[] args) {
        System.out.println("Original array:");
        displayArray(args);
        sortAlphabetically(args);
        System.out.println("Alphabetically sorted array: ");
        displayArray(args);
    }
    public static void sortAlphabetically(String ar[]){
        String temp;
        int pos;
        for(int i=0;i<ar.length-1;i++){
            pos = i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[pos].compareToIgnoreCase(ar[j])>0)
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
