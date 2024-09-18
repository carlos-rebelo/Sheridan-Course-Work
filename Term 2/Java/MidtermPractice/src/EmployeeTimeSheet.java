public class EmployeeTimeSheet {
    private String name;
    private int employeeNumber;
    private int hoursWorkedThisWeek;
    private EmployeeType employeeType;

    public EmployeeTimeSheet(String name, int employeeNumber, int hoursWorkedThisWeek, EmployeeType employeeType) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hoursWorkedThisWeek = hoursWorkedThisWeek;
        this.employeeType = employeeType;
    }

    public String getName() {
        return this.name;
    }

    public int getEmployeeNumber() {
        return this.employeeNumber;
    }

    public int getHoursWorkedThisWeek() {
        return this.hoursWorkedThisWeek;
    }
    public double getWages() {
        return hoursWorkedThisWeek * employeeType.getHourlyRate();
    }

    

}
