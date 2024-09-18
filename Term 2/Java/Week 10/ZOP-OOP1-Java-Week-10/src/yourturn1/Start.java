package yourturn1;

public class Start {
    public static void main(String[] args) {
        HomePhone homePhone = new HomePhone(905691733);
        homePhone.makeCall(905691935);
        PayPhone payPhone = new PayPhone();
        payPhone.acceptCoin(Coin.DIME);
        payPhone.acceptCoin(Coin.DIME);
        payPhone.acceptCoin(Coin.DIME);
        payPhone.makeCall(1111);
        
        CellPhone cellPhone = new CellPhone();

        System.out.println(cellPhone.getPowerStatus());
        cellPhone.makeCall(1111);
        cellPhone.setPowerStatus(Power.ON);
        cellPhone.makeCall(1111);

        Heart heart = new Heart(10, HeartBeat.BOOMCHIKA);
        heart.pump();
        System.out.println(heart.getHeartBeat());
        heart.setHeartBeat(HeartBeat.PITTERPATTER);
        heart.pump(); 

    }
}
