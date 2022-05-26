public class Main {

    static Employee[] list = new Employee[10];

    private static void allEmployee() {
        for (int i = 0; i < list.length; i++) {
            Employee employee = list[i];
            System.out.println(employee);
        }
    }

    private static double allSumSalary() {
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i].getSalary();
        }
        return sum;
    }


    private static void minSalaryEmployee() {
        double minSalary = 200000;
        String minimumSalary = null;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() < minSalary) {
                minSalary = list[i].getSalary();
                Employee employee = list[i];
                minimumSalary = "Сотрудник с минимально зарплатой: " + employee.getSurnameEmployee() + " " + employee.getNameEmployee() + " " + employee.getMiddleNameEmployee() + " - " + minSalary;
            }
        }
        System.out.println(minimumSalary);
    }

    private static void maxSalaryEmployee() {
        double maxSalary = 0;
        String maximumSalary = null;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() > maxSalary) {
                maxSalary = list[i].getSalary();
                Employee employee = list[i];
                maximumSalary = "Сотрудник с максимальной зарплатой: " + employee.getSurnameEmployee() + " " + employee.getNameEmployee() + " " + employee.getMiddleNameEmployee() + " - " + maxSalary;
            }
        }
        System.out.println(maximumSalary);
    }

    private static double averageSumSalary() {
        double averageSum = allSumSalary() / list.length;
        return averageSum;
    }

    private static void fullNameEmployee() {
        for (int i = 0; i < list.length; i++) {
            Employee employee = list[i];
            System.out.println("ФИО сотрудника: " + employee.getSurnameEmployee() + " " + employee.getNameEmployee() + " " + employee.getMiddleNameEmployee() + ".");
        }
    }

    private static void indexSalary(double indSal) {
        double indSalary = 0;
        for (int i = 0; i < list.length; i++) {
            indSalary = list[i].getSalary() * (1 + indSal / 100);
            Employee employee = list[i];
            System.out.println("ФИО сотрудника: " + employee.getSurnameEmployee() + " " + employee.getNameEmployee() + " " + employee.getMiddleNameEmployee() + ". Индексированная ЗП: " + indSalary + ".");
        }
    }

    private static void minSalaryInDepartment(int department) {
        String minSalaryDep = null;
        double minSalary = 200000;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() < minSalary && list[i].getDepartment() == department) {
                Employee employee = list[i];
                minSalaryDep = "Сотрудник отдела №" + employee.getDepartment() + " с минимальной ЗП, ФИО: " + employee.getSurnameEmployee() + " " + employee.getNameEmployee() + " " + employee.getMiddleNameEmployee() + ", ЗП: " + employee.getSalary() + ".";
            }
        }
        System.out.println(minSalaryDep);
    }

    private static void maxSalaryInDepartment(int department) {
        String maxSalaryDep = null;
        double maxSalary = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() > maxSalary && list[i].getDepartment() == department) {
                Employee employee = list[i];
                maxSalaryDep = "Сотрудник отдела №" + employee.getDepartment() + " с максимальной ЗП, ФИО: " + employee.getSurnameEmployee() + " " + employee.getNameEmployee() + " " + employee.getMiddleNameEmployee() + ", ЗП: " + employee.getSalary() + ".";
            }
        }
        System.out.println(maxSalaryDep);
    }

    private static void sumSalaryInDep(int department) {
        double sumDep = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == department) {
                sumDep += list[i].getSalary();
            }
        }
        System.out.println("Общие затраты на ЗП отдела составляет - " + sumDep);
    }

    private static void averageSumInDepartment(int department) {
        double averageSumDep = 0;
        double sumDep = 0;
        int q = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == department) {
                sumDep += list[i].getSalary();
                q++;
            }
        }
        averageSumDep = sumDep / q;
        System.out.println("Среднее значение ЗП: " + averageSumDep + ".");
    }

    private static void indSalaryInDepartment(int department, double indSalary) {
        double indSalaryDep =
                0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == department) {
                indSalaryDep = list[i].getSalary() * (1 + indSalary / 100);
                Employee employee = list[i];
                System.out.println("ФИО сотрудника: " + employee.getSurnameEmployee() + " " + employee.getNameEmployee() + " " + employee.getMiddleNameEmployee() + ". Проиндексированная ЗП - " + indSalaryDep + ".");
            }
        }
    }

    private static void nameEmployeeDep(int department) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == department) {
                Employee employee = list[i];
                System.out.println("ID: " + employee.getId() + ". ФИО сотрудника: " + employee.getSurnameEmployee() + " " + employee.getNameEmployee() + " " + employee.getMiddleNameEmployee() + ". ЗП: " + employee.getSalary() + ".");
            }
        }
    }

    private static void lessThanTheValue(int department, double value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() < value && list[i].getDepartment() == department) {
                Employee employee = list[i];
                System.out.println("Сотрудник: ID - " + employee.getId() + ", ФИО: " + employee.getSurnameEmployee() + " " + employee.getNameEmployee() + " " + employee.getMiddleNameEmployee() + ", ЗП: " + employee.getSalary() + ".");
            }
        }
    }

    private static void greatValue(int department, double value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() >= value && list[i].getDepartment() == department) {
                Employee employee = list[i];
                System.out.println("Сотрудник: ID - " + employee.getId() + ", ФИО: " + employee.getSurnameEmployee() + " " + employee.getNameEmployee() + " " + employee.getMiddleNameEmployee() + ", ЗП: " + employee.getSalary() + ".");
            }
        }
    }

    public static void main(String[] args) {

        list[0] = new Employee("Иван", "Федоров", "Сергеевич", 3, 56000.0);
        list[1] = new Employee("Алина", "Смирнова", "Викторовна", 2, 70000.3);
        list[2] = new Employee("Егор", "Прохоров", "Ильич", 3, 69000.0);
        list[3] = new Employee("Роман", "Григорьев", "Олегович", 4, 75000.0);
        list[4] = new Employee("Вера", "Кузнецова", "Михайловна", 3, 80000.0);
        list[5] = new Employee("Максим", "Сидоров", "Андреевич", 5, 100000.4);
        list[6] = new Employee("Андрей", "Васильев", "Максимович", 1, 85000.0);
        list[7] = new Employee("Валерия", "Коровина", "Андреевна", 2, 98000.7);
        list[8] = new Employee("Виктор", "Серков", "Александрович", 4, 45000.0);
        list[9] = new Employee("Дмитрий", "Дробков", "Викторович", 1, 77000.8);

        allEmployee();

        minSalaryEmployee();

        maxSalaryEmployee();

        System.out.println("Общие траты на ЗП в месяц: " + allSumSalary());
        System.out.println("Среднее значение ЗП среди сотрудников: " + averageSumSalary());

        fullNameEmployee();

        indexSalary(8);

        minSalaryInDepartment(1);

        maxSalaryInDepartment(5);

        sumSalaryInDep(1);

        averageSumInDepartment(3);

        indSalaryInDepartment(3, 20);

        nameEmployeeDep(3);

        lessThanTheValue(4, 50000);

        greatValue(3, 75000);
    }
}