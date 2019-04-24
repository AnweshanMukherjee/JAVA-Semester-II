//Question6
class EmployeeMainModified{
    public static void main(String[] args) {
        EmployeeModified e1 = new EmployeeModified();
        EmployeeModified e2 = new EmployeeModified("A", 32, 435);
        e1.getData();
        e2.getData();
        e1 = null;
        e2 = null;
        System.gc();
    }
}
