//Question7
class Manager extends EmployeeModified{
    String designation;
    Manager(String name, int age, int empID, String designation){
        super(name, age, empID);
        this.designation = designation;
    }
    void getData(){
        super.getData();
        System.out.println("Designation: "+designation);
    }
}
