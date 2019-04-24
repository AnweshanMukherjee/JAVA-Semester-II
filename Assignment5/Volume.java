//Question4
class Volume extends Area{
    int height;
    Volume(int length, int breadth, int height){
        super(length, breadth);
        this.height = height;
    }
    void findVolume(){
        System.out.println(length*breadth*height);
    }
}
