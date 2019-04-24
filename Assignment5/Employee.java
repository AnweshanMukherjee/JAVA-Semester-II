//Question5
class Employee extends Person{
    int empID;
    void setData(){
        super.setData();
        empID = 0;
    }
    void setData(String name, int age, int empID){
        super.setData(name, age);
        this.empID = empID;
    }
    void getData(){
        super.getData();
        System.out.println("EmpID: "+empID);
    }
}
