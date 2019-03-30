//Question4
class ComplexMain{
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(4, 5);
        System.out.print("c1 = ");
        c1.display();
        System.out.print("c2 = ");
        c2.display();
        System.out.print("c1 + c2 = ");
        getSum(c1, c2).display();
    }
    public static Complex getSum(Complex c1, Complex c2){
        return new Complex(c1.getReal()+c2.getReal(), c1.getImg()+c2.getImg());
    }
}
