package OSF.naukaJava.etap3.SetInterface;

import java.util.HashSet;

public class SetInterfece {
// can accept duplicate values
    // ArrayList, LinkedList, vector - implementing list interface
    //array have fixed size where as arraylist can grow dynamicaly
    //you access and insert any value in any index

    public static void main(String[] args) {

        //HashSet, treeset, LinkedHashset implements set interface
        //does not accept duplicate values

        HashSet<String> hs = new HashSet<String>();
        hs.add("USA");
        hs.add("UK");
        hs.add("INDIA");
        hs.add("INDIA");
        System.out.println(hs);
        System.out.println(hs.remove("UK"));
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
        System.out.println(hs);



    }

}
