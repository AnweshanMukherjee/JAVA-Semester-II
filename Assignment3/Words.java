//Queestion7
class Words{
    public static void main(String[] args) {
        String ar[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        int num = Integer.parseInt(args[0]);
        String word = "";
        while(num!=0){
            word = ar[num%10] + " " + word;
            num/=10;
        }
        System.out.println(word);
    }
}
