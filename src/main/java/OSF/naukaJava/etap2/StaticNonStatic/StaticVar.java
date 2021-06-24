package OSF.naukaJava.etap2.StaticNonStatic;

public class StaticVar {

    String name; // Instance Variables
    String address;
    static String city; //class variables
    static int i;
    static{
        city = "Warszawa";
        i = 0;
    }

    //konstruktor
    StaticVar(String name, String address) {
        this.name = name;
        this.address = address;
        i++;
        System.out.println(i);
    }

    public void getAddress() {
        System.out.println(address + " " + city);
    }

    public static void getCity() { // Static method will only accept static variables
        System.out.println(city);
    }

    public static void main(String[] args) {
        StaticVar staticVar = new StaticVar("Bob", "Budowniczy");
        StaticVar staticVar1 = new StaticVar("Jan", "Kowalski");
        StaticVar staticVar2 = new StaticVar("Jan", "Kowalski");
        staticVar.getAddress();
        staticVar1.getAddress();
        StaticVar.getCity();
    }
}
