package yourturn3;

public class MainframeComputer implements BasicMainframe, UpgradedMainframe {

    @Override
    public void accessUpgradedFunctionality()
    {
        System.out.println("Has access to upgraded functionality");
    }

    @Override
    public void accessBasicFunctionality()
    {
        System.out.println("Has access to basic functionality");
    }

}
