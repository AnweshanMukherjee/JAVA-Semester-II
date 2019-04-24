//Question3
class ShapeMain{
    public static void main(String[] args) {
        Circle obj = new Circle("Green", 32, 7);
        obj.findArea();
        obj.findCircumference();
        System.out.println("Color: "+obj.color);
        System.out.println("Weight: "+obj.weight);
    }
}
