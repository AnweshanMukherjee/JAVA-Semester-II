//Question1
class BSc_Student extends Student{
    String dept;
    int sem;
    BSc_Student(String name, String address, int rollNo, String dept, int sem){
        super(name, address, rollNo);
        this.dept = dept;
        this.sem = sem;
    }
    void display(){
        super.display();
        System.out.println("Dept.: "+dept);
        System.out.println("Sem: "+sem);
    }
}
