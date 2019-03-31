//Question2
class Maximum{
    public static void main(String[] args) {
        int ar[] = new int[args.length];
        for(int i=0;i<ar.length;i++)
            ar[i] = Integer.parseInt(args[i]);
        System.out.println("Max element = "+getMaxElement(ar));
    }
    public static int getMaxElement(int ar[]){
        int max = ar[0];
        for(int i=0;i<ar.length;i++){
            if(max<ar[i])
                max = ar[i];
        }
        return max;
    }
}
