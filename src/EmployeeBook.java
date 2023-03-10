public class EmployeeBook {

    private String getEmployeeNameWithMaxSalary(Employee[] array) {
        int maxSalary = array[0].getSalary();
        String fullName = null;
        for (int i = 1; i < array.length; i++) {
            Employee employee = array[i];
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                fullName = employee.getFullName();
            }
        }
        return fullName;


    }

}
