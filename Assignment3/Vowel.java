//Question6
class Vowel{
    public static void main(String[] args) {
        int count = 0;
        for(int i=0;i<args[0].length();i++){
            char ch = args[0].charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                count++;
        }
        System.out.println("No. of Vowels = "+count);
    }
}
