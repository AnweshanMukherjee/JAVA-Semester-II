//Question6
class PersonModified{
    private String name;
    private int age;
    PersonModified(){
        setData();
    }
    PersonModified(String name, int age){
        setData(name, age);
    }
    void setData(){
        name = "";
        age = 0;
    }
    void setData(String name, int age){
        this.name = name;
        this.age = age;
    }
    void getData(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
