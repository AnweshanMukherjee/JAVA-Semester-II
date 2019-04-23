//Question1
class Student{
    String name, address;
    int rollNo;
    Student(String name, String address, int rollNo){
        this.name = name;
        this.address = address;
        this.rollNo = rollNo;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Roll no.: "+rollNo);
    }
}
