//Question2
class Shape{
    double area(double r){
        return Math.PI*r*r;
    }
    int area(int a, int b){
        return a*b;
    }
    int area(int a){
        return a*a;
    }
    public static void main(String[] args) {
        Shape obj = new Shape();
        System.out.println("Circle: "+obj.area(7.0));
        System.out.println("Rectangle: "+obj.area(4,3));
        System.out.println("Circle: "+obj.area(4));
    }
}
