//Question6
class ReverseString{
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            if(args[i].length()==5)
                args[i] = reverse(args[i]);
            System.out.print(args[i]+" ");
        }
        System.out.println();
    }
    static String reverse(String s){
        String s1 = "";
        for(int i=s.length()-1;i>=0;i--)
            s1+=s.charAt(i);
        return s1;
    }
}
