//Question5
class EmployeeMain{
        public static void main(String[] args) {
            Employee e1 = new Employee();
            e1.setData();
            Employee e2 = new Employee();
            e2.setData("A", 19, 519);
            e1.getData();
            e2.getData();
        }
}
