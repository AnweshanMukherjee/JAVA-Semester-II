//Question4
package myapplication.algebra;
public class TwoDEquation{
    private int a, b, c;
    public TwoDEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void getMaxRoots(){
        double x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        double x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
        if(x1>0 || x2>0)
            System.out.println("Max positive root = "+Math.max(x1,x2));
        else
            System.out.println("No positive roots found.");
    }
}
