package yourturn3complete;

public class MainframeComputer implements BasicMainframe, UpgradedMainframe {

    @Override
    public void accessUpgradedFunctionality()
    {
        System.out.println("Accessing upgraded functionality");
    }

    @Override
    public void accessBasicFunctionality()
    {
        System.out.println("Accessing Basic Functionality");
    }

}
