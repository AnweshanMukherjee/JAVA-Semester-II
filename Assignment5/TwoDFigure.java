//Question3
abstract class TwoDFigure{
    String color;
    int weight;
    TwoDFigure(String color, int weight){
        this.color = color;
        this.weight = weight;
    }
    abstract void findArea();
    abstract void findCircumference();
}
