package OSF.naukaJava.etap3.MapInterface;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterfaceA {


    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(0, "hello");
        hm.put(1, "Bye");
        hm.put(42, "Morning");
        hm.put(3, "evening");
        System.out.println(hm.get(42));
        hm.remove(42);
        System.out.println(hm.get(42));
        Set sn = hm.entrySet();
        Iterator it = sn.iterator();

        while (it.hasNext()){
            Map.Entry mp = (Map.Entry)it.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }
    }
}
