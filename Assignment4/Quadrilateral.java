//Question1
class Quadrilateral{
    private int length, breadth;
    Quadrilateral(){
        length = breadth = 0;
    }
    Quadrilateral(int x){
        length = x;
        breadth = x;
    }
    Quadrilateral(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    Quadrilateral(Quadrilateral obj){
        length = obj.length;
        breadth = obj.breadth;
    }
    void display(){
        System.out.println("Length = "+length);
        System.out.println("Breadth = "+breadth);
    }
    void calculate(){
        System.out.println("Area = "+(length*breadth)+" sq. units");
        System.out.println("Perimeter = "+(2*(length+breadth))+" units");
    }
    public static void main(String[] args) {
        Quadrilateral obj = new Quadrilateral(7, 3);
        obj.display();
        obj.calculate();
    }
}
