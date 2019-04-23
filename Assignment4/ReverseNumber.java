//Question4
class ReverseNumber{
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            if(args[i].length()==3)
                args[i] = reverse(args[i]);
            System.out.print(args[i]+" ");
        }
        System.out.println();
    }
    static String reverse(String s){
        try{
            int num = Integer.parseInt(s);
        }
        catch(NumberFormatException e){
            return "-1";
        }
        String s1 = "";
        for(int i=s.length()-1;i>=0;i--)
            s1+=s.charAt(i);
        return s1;
    }
}
