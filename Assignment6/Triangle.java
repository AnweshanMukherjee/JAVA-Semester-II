//Question4
package myapplication.geometry;
public class Triangle{
    private int side1, side2, side3, height, base;
    public Triangle(int side1, int side2, int side3, int height, int base){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
        this.base = base;
    }
    public void area(){
        System.out.println("Area of triangle = "+(base*height/2)+" sq. units");
    }
    public void perimeter(){
        System.out.println("Perimeter of triangle = "+(side1+side2+side3)+" units");
    }
}
