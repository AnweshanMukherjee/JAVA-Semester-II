//Question1
class Sort{
    public static void main(String[] args) {
        int ar[] = new int[args.length];
        for(int i=0;i<ar.length;i++){
            ar[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Original array: ");
        displayArray(ar);
        sort(ar);
        System.out.println("Sorted array in ascending order: ");
        displayArray(ar);
    }
    public static void sort(int ar[]){
        int temp, pos;
        for(int i=0;i<ar.length-1;i++){
            pos = i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[pos]>ar[j])
                    pos = j;
            }
            temp = ar[pos];
            ar[pos] = ar[i];
            ar[i] = temp;
        }
    }
    public static void displayArray(int ar[]){
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+"  ");
        System.out.println();
    }
}
