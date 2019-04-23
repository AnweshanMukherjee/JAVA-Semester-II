//Question3
class Student{
    private int rollNo;
    private String name;
    int marks[];
    Student(int rollNo, String name, int m1, int m2){
        this.rollNo = rollNo;
        this.name = name;
        marks = new int[2];
        marks[0] = m1;
        marks[1] = m2;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll no.: "+rollNo);
        System.out.print("Marks: ");
        for(int i=0;i<marks.length;i++)
            System.out.print(marks[i]+"  ");
        System.out.println();
    }
}
