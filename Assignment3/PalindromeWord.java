//Question5
class PalindromeWord{
    public static void main(String[] args) {
        System.out.println("Word: "+args[0]);
        String rev = reverse(args[0]);
        System.out.println("Reverse: "+rev);
        if(args[0].equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    public static String reverse(String word){
        String rev = "";
        for(int i=word.length()-1;i>=0;i--)
            rev+=word.charAt(i);
        return rev;
    }
}
