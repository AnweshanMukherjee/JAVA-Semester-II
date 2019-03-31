//Question8
class NonFibonacci{
    public static void main(String[] args) {
        int lLimit = Integer.parseInt(args[0]);
        int uLimit = Integer.parseInt(args[1]);

        System.out.println("Non-Fibonacci numbers: ");
        int a = 1, b = 0, c = 1, previous = 1;
        while(c<=uLimit){
            c = a+b;
            a = b;
            b = c;
            displayNonFibo(previous,c, lLimit, uLimit);
            previous = c;
        }

        System.out.println();
    }
    public static void displayNonFibo(int a, int b, int lLimit, int uLimit){
        for(int i=a+1;i<=b-1;i++){
            if(i>=lLimit && i<=uLimit)
                System.out.print(i+"\t");
        }
    }
}
