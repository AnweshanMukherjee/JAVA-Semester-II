//Question5
class Student{
    private String name;
    private int marks1, marks2, marks3;
    Student(String name, int marks1, int marks2, int marks3){
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    public static void main(String[] args){
        Student s = new Student(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
        System.out.println("Name: "+s.name);
        System.out.println("Marks1 = "+s.marks1);
        System.out.println("Marks2 = "+s.marks2);
        System.out.println("Marks3 = "+s.marks3);
        System.out.println("Grade: "+s.getGrade());
    }
    private String getGrade(){
        int marks = (marks1+marks2+marks3)/3;
        System.out.println("Average = "+marks);
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
