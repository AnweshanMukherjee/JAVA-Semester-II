//Question6
class EmployeeModified extends PersonModified{
    int empID;
    EmployeeModified(){
        super();
        setData();
    }
    EmployeeModified(String name, int age, int empID){
        super(name,age);
        setData(empID);
    }
    void setData(){
        empID = 0;
    }
    void setData(int empID){
        this.empID = empID;
    }
    void getData(){
        super.getData();
        System.out.println("EmpID: "+empID);
    }
    public void finalize(){
        System.out.println("Finalizing.");
    }
}
