//Question4
import myapplication.geometry.Triangle;
import myapplication.geometry.Rectangle;
import myapplication.algebra.TwoDEquation;
class MyApplicationMain{
    public static void main(String[] args) {
        Triangle obj1 = new Triangle(1,2,3,4,6);
        Rectangle obj2 = new Rectangle(4,3);
        TwoDEquation obj3 = new TwoDEquation(1,-1,-2);
        obj1.area();
        obj1.perimeter();
        obj2.area();
        obj2.perimeter();
        obj3.getMaxRoots();
    }
}
