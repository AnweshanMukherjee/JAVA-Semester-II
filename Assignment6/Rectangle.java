//Question4
package myapplication.geometry;
public class Rectangle{
    private int side1, side2;
    public Rectangle(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    public void area(){
        System.out.println("Area of rectangle = "+(side1*side2)+" sq. units");
    }
    public void perimeter(){
        System.out.println("Perimeter of rectangle = "+(2*(side1+side2))+" units");
    }
}
