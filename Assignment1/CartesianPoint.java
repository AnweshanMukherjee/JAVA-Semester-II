//Question3
class CartesianPoint{
    private int x, y;
    CartesianPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void display(){
        System.out.println("("+x+","+y+")");
    }
}
