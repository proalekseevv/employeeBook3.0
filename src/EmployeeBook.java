public class EmployeeBook {
    private static Employee[] employees = new Employee[10];

    public EmployeeBook() {
        this.employees = new Employee[10];
    }


    // Цикл добавление сотрудников
    public void addEmployee(String lastName, String name, String middleName,int department, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee newEmployee = new Employee(lastName, name , middleName,department, salary );
                employees[i] = newEmployee;
                break;
            }
        }
    }



    // Печать всех сотрудников
    public void printString() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.printSting());
            }
        }
    }


    // Считает общую зарплату
    public static double TotalMonthlySalary() {
        int total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    // Считает минимальную ЗП
    public static String minSalaryEmploy(){
        Employee employee = null;
        int minSalary = Integer.MAX_VALUE;
                for(Employee emp : employees) {
                    if(emp.getSalary() < minSalary){
                        minSalary = (int) emp.getSalary();
                        employee = emp;
                    }
                }
        return employee.printSting();
    }

    // Считает максимальную ЗП
    public static String maxSalaryEmploy(){
        Employee employee = null;
        int maxSalary = Integer.MIN_VALUE;
        for(Employee emp : employees) {
            if(emp.getSalary() > maxSalary){
                maxSalary = (int) emp.getSalary();
                employee = emp;
            }
        }
        return employee.printSting();
    }


    // Считает среднюю ЗП
    public static double  averageSalaryEmploy(){
        return TotalMonthlySalary() /(double) employees.length;

    }

    // Получение ФИО сотрудников
    public void printEmploy() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }



















}







