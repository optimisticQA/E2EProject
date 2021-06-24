package OSF.naukaJava.etap1.Interface;

public class AustralianTrafic implements CentralTraffic, ContinentalTraffic {

    public static void main(String[] args){
        AustralianTrafic a = new AustralianTrafic();
        a.redStop();
        a.FlashYellow();
        a.greenGo();
        AustralianTrafic at = new AustralianTrafic();
        ContinentalTraffic ct = new AustralianTrafic();
        at.walkonsymbol();
        ct.Trainsymbol();
    }

    @Override
    public void redStop() {
        System.out.println(" redstop implementation");
    }

    public void walkonsymbol()
    {
        System.out.println(" walking");
    }

    @Override
    public void FlashYellow() {
        System.out.println(" flash yellow implementation");
    }

    @Override
    public void greenGo() {
        System.out.println(" green implementation");
    }

    @Override
    public void Trainsymbol() {

    }
}
