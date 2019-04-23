//Question7
class PrimeSum{
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0;i<args.length;i++){
            if(ifPrime(Integer.parseInt(args[i])))
                sum+=Integer.parseInt(args[i]);
        }
        System.out.println("Sum of primes = "+sum);
    }
    static boolean ifPrime(int num){
        for(int i=2;i<=num/i;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
