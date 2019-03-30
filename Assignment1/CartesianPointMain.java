//Question3
class CartesianPointMain{
    public static void main(String[] args) {
        CartesianPoint p1 = new CartesianPoint(7, 3);
        CartesianPoint p2 = new CartesianPoint(8, 5);
        System.out.print("p1 = ");
        p1.display();
        System.out.print("p2 = ");
        p2.display();
        System.out.println("Distance between p1 and p2 = "+getDistance(p1, p2));
    }
    public static double getDistance(CartesianPoint p1, CartesianPoint p2){
        return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
}
