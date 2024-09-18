public class TimeSheetManager {

    private EmployeeTimeSheet[] timeSheets = new EmployeeTimeSheet[20];
    private int numTimeSheets;

    public void addTimeSheet(EmployeeTimeSheet timeSheet) {
        timeSheets[numTimeSheets] = timeSheet;
        numTimeSheets++;
    }

    public double getTotalWagesForThisWeek() {
        double totalWages = 0;
        for (int i = 0; i < numTimeSheets; i++) {
            totalWages += timeSheets[i].getWages();
        }
        return totalWages;
    }

    public void printPayStubs() {
        for (int i = 0; i < numTimeSheets; i++) {
            System.out.println("Name: "+timeSheets[i].getName()+" Employee Number: "+timeSheets[i].getEmployeeNumber()+" Hours Worked: "+timeSheets[i].getHoursWorkedThisWeek()+" Payment Owed: "+timeSheets[i].getWages());
        }

    }


}
