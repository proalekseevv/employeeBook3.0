public class Employee {

    private final String name;
    private final String surName;
    private final String lastName;

    private int department;
    private int salary;
    private int id;
    private static int Counter;



    // Конструктор
    public Employee(String name, String surname, String lastname, int department, int salary) {
        this.name = name;
        this.surName = surname;
        this.lastName = lastname;
        this.department = department;
        this.salary = salary;
        this.id = Counter++;



    }

    // Геттеры
    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSurName() {
        return this.surName;
    }

    public int getDepartment() {
        return this.department = (department >= 1 && department <= 5) ? department : 1;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public String getFullName() {
        return name() + " " + surName() + " " + lastName();
    }
    public String getEmployeeData() {
        return "ID: " + getId() + " | ФИО: " + getFullName() + " | зарплата: " + getSalary();
    }



    //Сететтеры
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    //вывод
    @Override
    public String toString() {
        return "id: " + id + " Имя " + this.name + " Фамилия " + this.surName + " Отчество " + this.lastName + " Отдел: " + this.department + " Зарплата : " + this.salary;
    }
}



