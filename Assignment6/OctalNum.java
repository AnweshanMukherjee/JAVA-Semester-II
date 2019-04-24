//Question5
class OctalNum extends Number{
    OctalNum(int num){
        super(num);
    }
    public void displayNum(){
        String octNum = "";
        while(num!=0){
            octNum = (num%8) + octNum;
            num/=8;
        }
        System.out.println("OctalNum = "+octNum);
    }
}
