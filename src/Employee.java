public class Employee {
    private String nameEmployee;
    private String surnameEmployee;
    private String middleNameEmployee;
    private int department;
    private double salary;
    private int id;
    static int counter = 0;

    public Employee(String nameEmployee, String surnameEmployee, String middleNameEmployee, int department, double salary) {
        id = counter++;
        this.nameEmployee = nameEmployee;
        this.surnameEmployee = surnameEmployee;
        this.middleNameEmployee = middleNameEmployee;
        this.department = department;
        this.salary = salary;
    }

    public String getNameEmployee() {
        return this.nameEmployee;
    }

    public String getSurnameEmployee() {
        return this.surnameEmployee;
    }

    public String getMiddleNameEmployee() {
        return this.middleNameEmployee;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getId() {
        return this.id;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ID " + id + "; Ф.И.О: " + surnameEmployee + " " + nameEmployee + " " + middleNameEmployee + "; Зарплата: " + salary + "; Отдел: " + department + ".";
    }
}