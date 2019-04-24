//Question5
class HexNum extends Number{
    HexNum(int num){
        super(num);
    }
    public void displayNum(){
        String hexNum = "";
        while(num!=0){
            int x = num%16;
            if(x<10)
                hexNum = x + hexNum;
            else
                hexNum = (char)('A'+x-10) + hexNum;
            num/=16;
        }
        System.out.println("HexNum = "+hexNum);
    }
}
