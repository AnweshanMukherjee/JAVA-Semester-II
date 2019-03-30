//Question5
class Student{
    private String name;
    private int marks;
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    public static void main(String[] args){
        Student s = new Student("Anweshan Mukherjee", 76);
        System.out.println("Name: "+s.name);
        System.out.println("Marks = "+s.marks);
        System.out.println("Grade: "+s.getGrade());
    }
    private String getGrade(){
        if(marks>=90)
            return "O";
        if(marks>=80)
            return "A";
        if(marks>=70)
            return "B";
        if(marks>=50)
            return "C";
        return "F";
    }
}
