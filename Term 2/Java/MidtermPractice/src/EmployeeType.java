public enum EmployeeType {
    JUNIOR(20), ASSOCIATE(50), SENIOR(80);
    private int dollarsPerHour;
    
    private EmployeeType(int dollarsPerHour) {
        this.dollarsPerHour = dollarsPerHour;
    }

    public int getHourlyRate() {
        return dollarsPerHour;
    }
}
