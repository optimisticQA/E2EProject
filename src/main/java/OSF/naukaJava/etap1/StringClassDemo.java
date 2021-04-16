package OSF.naukaJava.etap1;

public class StringClassDemo {

    public static void main(String[] args) {
        //String: to jedna z gotowych klas w java
        /*
        1. String literal - dosłownie
        2. Bu creating object of string - tworząc obiekt typu string
        */
        //String a = "helloa"; //String literal - dosłownie
        //String b = "hellob"; //W tym przypadku java nie tworzy nowej zmiennej b ponieważ a ma taką samą wartość, co innego w przypadku tworzenia obiektu - wtedy tworzonesą dwie zmienne.
        //String ab = new String("helloab"); //With string class - obiekt typu string

        String a = " javatraining";

        System.out.println(a.charAt(2)); //Wyświetla znak na podstawie wskazanego indexu
        System.out.println(a.indexOf("e")); //Wyświetla numer indexu
        System.out.println(a.substring(3, 6));//Wyświetla znaki licząc 3 od początku, a 6 od końca
        System.out.println(a.substring(5));//Wyświetla znaki bez pierwszych, według wskazania
        System.out.println(a.concat("Artur tester"));//Dodaje wprowadzony tekst do zadeklarowanego stringu "a"
        System.out.println(a.trim());//Usuwa białe spacje
        a.toUpperCase();//Zmienia litery na duże
        a.toLowerCase();//Zmienia litery na małe
        //split - rozdziel
        String arr[] = a.split("t"); //Tworzy tablicę i dzieli string na części
        System.out.println(arr[0]);//Wyświatle 1 część
        System.out.println(arr[1]);//Wyświetla 2 część
        System.out.println(a.replace("t", "s"));//Zamienia literę t na s


    }

}
