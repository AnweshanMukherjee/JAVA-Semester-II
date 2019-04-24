//Question3
class Circle extends TwoDFigure{
    int r;
    Circle(String color, int weight, int r){
        super(color, weight);
        this.r = r;
    }
    void findArea(){
        System.out.println(Math.PI*r*r);
    }
    void findCircumference(){
        System.out.println(2*Math.PI*r);
    }
}
