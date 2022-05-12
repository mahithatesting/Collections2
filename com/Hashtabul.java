package Collections.com;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Hashtabul {
    // no insertion order random wise order
    // only synchronized
    // only single thread at a time access
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("name", "Abhishek");
        ht.put("name1", "Bbhishek");
        ht.put("name2", "Cbhishek");
        ht.put("name22", "Dbhishek");
        Set ss = ht.keySet();
        Iterator itrhh = ss.iterator();
        while (itrhh.hasNext()) {
            Object oh = itrhh.next();
            String sth = (String) oh;
            System.out.println(sth + ":" + ht.get(sth));


        }
    }
}