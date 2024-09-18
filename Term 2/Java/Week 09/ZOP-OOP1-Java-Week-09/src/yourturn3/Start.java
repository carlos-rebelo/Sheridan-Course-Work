package yourturn3;

public class Start {
    public static void main(String[] args)
    {
        // In the old, old days, IBM used to sell Mainframe computers.  Often the customer would buy a mainframe with a standard amount of memory and then decide in a few months that they needed more.  This required a highly-skilled hardwared technician to come out to the customer's building and physically install the memory boards.
        //IBM eventually figured out that it was cheaper to ship all of their mainframes with the extra memory already installed, and use software to restrict its usage until the company ordered the extra memory.  At that point, IBM would send out sales techs with no skill to go to the site with a toolbox and great fanfare.  The sales tech would make a big show of the upgrade but would, in fact, only need to turn a screw 90 degrees to unlock the extra memory.  This became known as the 'golden screwdriver' https://www.urbandictionary.com/define.php?term=Golden%20Screwdriver

        //We are going to do the same thing but with polymorphic interfaces.

        // Make MainframeComputer implement both BasicMainframe and UpgradedMainframe interfaces.  Just have each method print out the method name.

        //Go ahead and create a referenceVariable called actualMainFrame and instantiate our Mainframe Computer.  As you would expect, we can access both methods/

        //However, if you declare a reference variable of type BasicMainframe and set its value to the MainFrame computer object's address, you will only be able to see the method associated with the BasicMainfram.

        //if you declare a referecne variable of type UpgradedMainframe and assign the address of that same object to it, you will only be able to see the method associated with the Upgraded mainframe.

        //we now have three reference variables, all pointing to the same MainframeComputer object and each of them sees the object as something different!

        //The MainframeComputer reference variable sees all methods, the BasicMainframe reference variable sees only the basic method, and the UpgradedMainframe variable only sees the upgrades methods

        //

        MainframeComputer Actualmainframe = new MainframeComputer();
        Actualmainframe.accessBasicFunctionality();
        Actualmainframe.accessUpgradedFunctionality();

        BasicMainframe basic = Actualmainframe;
        basic.accessBasicFunctionality();

        UpgradedMainframe upgrade = Actualmainframe;
        upgrade.accessUpgradedFunctionality();
        ((MainframeComputer) upgrade).accessBasicFunctionality();

    }
}
