public class Main {
    public static void main(String[] args) {
        // Список сотрудников
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee( "Иванов", "Иван", "Сергеевич", 1, 20344 );
        employeeBook.addEmployee( "Баранов", "Иван", "Сергеевич", 2, 5344 );
        employeeBook.addEmployee( "Сергеев", "Иван", "Сергеевич", 3, 220344 );
        employeeBook.addEmployee( "Петров", "Иван", "Сергеевич", 3, 20344 );
        employeeBook.addEmployee( "Батулин", "Иван", "Сергеевич", 1, 10344 );
        employeeBook.addEmployee( "Круглов", "Иван", "Сергеевич", 2, 230344 );
        employeeBook.addEmployee( "Бешков", "Иван", "Сергеевич", 1, 21344 );
        employeeBook.addEmployee( "Менделеев", "Иван", "Сергеевич", 3, 24344 );
        employeeBook.addEmployee( "Ньютон", "Иван", "Сергеевич", 1, 26344 );
        employeeBook.addEmployee( "Ахмедов", "Иван", "Сергеевич", 4, 29344 );

        // Вызов печати всех сотрудников
        employeeBook.printString();
        // Вызов остальных методов
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц: " + employeeBook.TotalMonthlySalary() + " руб.");
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook.minSalaryEmploy());
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeBook.maxSalaryEmploy());
        System.out.println();
        System.out.println("Среднее значение зарплат: " + employeeBook.averageSalaryEmploy());
        System.out.println();

        // ФИО всех сотрудников
        System.out.println("ФИО сотрудников : ");
        employeeBook.printEmploy();

















    }

}
