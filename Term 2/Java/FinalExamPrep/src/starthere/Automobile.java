package starthere;

public  class Automobile {
    private String licensePlate;
    private boolean engineRunning;
    private Person driver;
    private static int nextVinNumber;
    private int vinNumber;

    public Automobile(String plate) {
        this.licensePlate = plate;
        engineRunning = false;
        vinNumber = nextVinNumber;
        nextVinNumber++;
    }
    public Automobile(String plate, Person driver) {
        this.licensePlate = plate;
        this.driver = driver;
        engineRunning = false;
        vinNumber = nextVinNumber;
        nextVinNumber++;
    }

    public void driveTo(String destination) throws Exception {
        if (engineRunning != true) {
            System.out.println("Sorry, engine is not running");
            return;
        }
        else if(destination == "IceCream Store") {
            throw new Exception("Not allowed to go for IceCream without Rich!");
        }
        else if (driver.getAge() < 16) {
            System.out.println("Sorry the Automobile must have driver over 16 in it in order to drive it");
        }
        else {
            System.out.println(driver.getName()+" is driving to "+destination);
        }
    }

    public  void honk() {
        
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public boolean getEngineStatus() {
        return engineRunning;
    }

    public void startEngine() {
        engineRunning = true;
    }

    public int getVinNumber() {
        return vinNumber;
    }
    public void stopEngine() {
        engineRunning = true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((licensePlate == null) ? 0 : licensePlate.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Automobile other = (Automobile) obj;
        if (licensePlate == null) {
            if (other.licensePlate != null)
                return false;
        } else if (!licensePlate.equals(other.licensePlate))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Automobile [licensePlate=" + licensePlate + "]";
    }
}
