package garbabgecollection;

public class Start {
    public static void main(String[] args)
    {

        ClassA ref0 = new ClassA(12);
        ref0 = null; //this object just got garbage collected because there are no reference variables that hold its address.  The JVM can no longer ever access this object

        ClassA ref1 = new ClassA(100);
        ClassA ref2 = ref1;
        ClassA ref3 = ref2;

        ref1 = null; //garbage collected?
        ref2 = null; //garbage collected?
        ref3 = null; //garbage collected?


    }
}
