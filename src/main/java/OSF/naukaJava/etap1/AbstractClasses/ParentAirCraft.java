package OSF.naukaJava.etap1.AbstractClasses;

public abstract class ParentAirCraft {

    //Non abstract method
    public void engine()
    {
        System.out.println("Follow Engine Guidelinses");
    }

    public void safetyGuidelines()
    {
        System.out.println("Follow Safety Guidelinses");
    }

    //Abstract method
    public abstract void bodyColor();
}
