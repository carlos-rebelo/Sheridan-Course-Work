public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        EmployeeTimeSheet tim1 = new EmployeeTimeSheet("Carlos",1, 10, EmployeeType.JUNIOR);
        EmployeeTimeSheet tim2 = new EmployeeTimeSheet("Justin",2, 10, EmployeeType.ASSOCIATE);
        EmployeeTimeSheet tim3 = new EmployeeTimeSheet("Rich",3, 10, EmployeeType.SENIOR);
        EmployeeTimeSheet tim4 = new EmployeeTimeSheet("Kyle",4, 20, EmployeeType.ASSOCIATE);
        EmployeeTimeSheet tim5 = new EmployeeTimeSheet("Leah",5, 20, EmployeeType.JUNIOR);

        TimeSheetManager timManager = new TimeSheetManager();
        timManager.addTimeSheet(tim1);
        timManager.addTimeSheet(tim2);
        timManager.addTimeSheet(tim3);
        timManager.addTimeSheet(tim4);
        timManager.addTimeSheet(tim5);

        System.out.println(timManager.getTotalWagesForThisWeek());
        timManager.printPayStubs();
    }
}
