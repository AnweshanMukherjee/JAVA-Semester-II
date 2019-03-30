//Question1
class Factorial{
  public static void main(String[] args) {
    int num = 3, fact = 1, dup = num;
    while(dup!=0){
      fact*=dup--;
    }
    System.out.println(num+"! = "+fact);
  }
}
