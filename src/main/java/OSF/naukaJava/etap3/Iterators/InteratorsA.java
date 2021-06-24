package OSF.naukaJava.etap3.Iterators;


import java.util.HashSet;
import java.util.Iterator;

public class InteratorsA {
// can accept duplicate values
    // ArrayList, LinkedList, vector - implementing list interface
    //array have fixed size where as arraylist can grow dynamicaly
    //you access and insert any value in any index

    public static void main(String[] args) {

        //HashSet, treeset, LinkedHashset implements set interface
        //does not accept duplicate values
        //There is no guarantee elements stored in sequental odrder..Random order

        HashSet<String> hs = new HashSet<String>();
        hs.add("USA");
        hs.add("UK");
        hs.add("INDIA");
        hs.add("he");
        hs.add("she");

        hs.add("INDIA");
        System.out.println(hs);
        //System.out.println(hs.remove("UK"));
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
        //System.out.println(hs);


        Iterator<String> i = hs.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }


    }

}
