//Question8
class StudentModified extends PersonModified{
    private int std;
    StudentModified(String name, int age, int std){
        super(name, age);
        this.std = std;
    }
    void getData(){
        super.getData();
        System.out.println("Std: "+std);
    }
}
