
public class Employee {

    private final String name;
    private final String lastName;
    private final String middleName;
    private double salary;
    private int department;

    private static int counter = 0; // счетчик
    private final int id = counter;  // поле id, которое проставляется из счетчика



    // Конструктор
    public Employee(String name, String lastName, String middleName, int department, double salary ) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        counter++;
    }


    // Геттеры
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName(){
        return middleName;
    }

    public double getSalary() {
        return  salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return getName() + " " + getLastName() + " " + getMiddleName();
    }

    public String printSting() {
        return "ID: " + getId() + " | ФИО: " + getFullName() + " | зарплата: " + getSalary();
    }


    // сеттеры

    public void setSalary(int salary) {
        this.salary = (salary >= 0) ? salary : 0;
    }


    public void setDepartment(int department) {
        this.department = (department >= 1 && department <= 5) ? department : 1; // ? - тернарный оператор
    }


















}
