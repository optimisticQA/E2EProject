package OSF.naukaJava.etap1;

public class FirstClass {

    // Methods - blok kodu w klasie java
    public int getDataInt() {
        System.out.println("Jestem metodą int");
        return 2;
    }

    public String getDataString() {
        System.out.println("Jestem metodą string");
        return "2";
    }

    public void getDataVoid() {
        System.out.println("Jestem metodą void");
    }

    //Objects - obiekty są instancjami / referencjami klas
    public static void main(String[] args) {
        int a = 1;
        FirstClass fn = new FirstClass(); //Wzór tworzenia objektu dla klasy
        fn.getDataInt(); //Dzieki temu blok z getDataInt zostanie wykonany w tej metodzie
        OSF.naukaJava.etap1.SecondClass sn = new OSF.naukaJava.etap1.SecondClass(); //Tworzy obiekt dla metody z innej klasy
        sn.setData(); //Wywołuje metodę z innej klasy
        System.out.print("hi ");
        System.out.println("hello world"); //Nowa linia
        System.out.print(a);
    }

}
