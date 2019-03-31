//Question6
class Number{
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int noOfDigits = countDigits(num);
        int reverse = getReverse(num);
        System.out.println("No. of digits = "+noOfDigits);
        System.out.println("Reverse = "+reverse);
    }
    public static int countDigits(int num){
        int count = 0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }
    public static int getReverse(int num){
        int reverse = 0;
        while(num!=0){
            reverse = reverse*10 + num%10;
            num/=10;
        }
        return reverse;
    }
}
