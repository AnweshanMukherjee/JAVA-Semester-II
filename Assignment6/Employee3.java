//Question3
import com.address.Address;
class Employee3 extends Person3{
    int empID;
    Address a;
    void setData(){
        super.setData();
        a = new Address("");
        empID = 0;
    }
    void setData(String name, int age, String address, int empID){
        super.setData(name, age);
        a = new Address(address);
        this.empID = empID;
    }
    void getData(){
        super.getData();
        System.out.println("Address: "+a.address);
        System.out.println("EmpID = "+empID);
    }
}
