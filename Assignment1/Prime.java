//Question2
class Prime{
  public static void main(String[] args) {
    int num = 7;
    if(num==1)
      System.out.println("Unique Number");
    else if(ifPrime(num))
      System.out.println("Prime number");
    else
      System.out.println("Composite number");
  }
  public static boolean ifPrime(int num){
    for(int i=2;i<=n/i;i++){
      if(num%i==0)
        return false;
    }
    return true;
  }
}
