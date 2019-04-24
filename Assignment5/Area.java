//Question4
class Area{
    int length, breadth;
    Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void areaSquare(){
        System.out.println(length*length);
    }
    void areaRectangle(){
        System.out.println(length*breadth);
    }
}
