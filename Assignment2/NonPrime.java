//Question7
class NonPrime{
    public static void main(String[] args) {
        int lLimit = Integer.parseInt(args[0]);
        int uLimit = Integer.parseInt(args[1]);
        System.out.println("Non Prime Numbers:");
        for(int i=lLimit;i<=uLimit;i++){
            if(!ifPrime(i))
                System.out.println(i);
        }
    }
    public static boolean ifPrime(int num){
        for(int i=2;i<=num/i;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
