//Question3
class StudentMain{
    public static void main(String[] args) {
        Student s[] = new Student[5];
        s[0] = new Student(1, "A", 12, 54);
        s[1] = new Student(2, "B", 72, 96);
        s[2] = new Student(3, "C", 22, 55);
        s[3] = new Student(4, "D", 13, 56);
        s[4] = new Student(5, "E", 56, 55);
        sortArray(s);
        System.out.println("Sorted list:");
        for(int i=0;i<s.length;i++){
            System.out.println((i+1)+".");
            s[i].display();
            System.out.println("Sum = "+(s[i].marks[0]+s[i].marks[1]));
        }
    }
    static void sortArray(Student s[]){
        for(int i=0;i<s.length;i++){
            int min = i;
            for(int j=i+1;j<s.length;j++){
                if(s[min].marks[0]+s[min].marks[1]>s[j].marks[0]+s[j].marks[1])
                    min = j;
            }
            Student temp = s[min];
            s[min] = s[i];
            s[i] = temp;
        }
    }
}
