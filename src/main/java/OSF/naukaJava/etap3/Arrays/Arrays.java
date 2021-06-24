package OSF.naukaJava.etap3.Arrays;

import java.util.ArrayList;

public class Arrays {
// can accept duplicate values
    // ArrayList, LinkedList, vector - implementing list interface
    //array have fixed size where as arraylist can grow dynamicaly
    //you access and insert any value in any index

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        a.add("artur");
        a.add("java");
        System.out.println(a);
        a.add(0,"student");
        System.out.println(a);
       /*
        a.remove(1);
        a.remove("java");
        System.out.println(a);
        */
        System.out.println(a.get(2));
        // testing
        System.out.println(a.contains("testing"));
        System.out.println(a.indexOf("artur"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
        
    }

}
