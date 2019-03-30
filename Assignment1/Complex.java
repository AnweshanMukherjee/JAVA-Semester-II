//Question4
class Complex{
    private int real, img;
    Complex(int real, int img){
        this.real = real;
        this.img = img;
    }
    int getReal(){
        return real;
    }
    int getImg(){
        return img;
    }
    void display(){
        System.out.println(real+" + "+img+"i");
    }
}
