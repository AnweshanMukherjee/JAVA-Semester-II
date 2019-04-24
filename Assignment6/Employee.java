//Question2
import com.person.Person;
import com.address.Address;
class Employee{
    Person p;
    Address a;
    int empID;
    Employee(String name, int age, String address, int empID){
        p = new Person(name, age);
        a = new Address(address);
        this.empID = empID;
    }
    void display(){
        System.out.println("Name: "+p.name);
        System.out.println("Age: "+p.age);
        System.out.println("Address: "+a.address);
        System.out.println("EmpID: "+empID);
    }
}
