package Collections.com;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedMap {
    public static void main(String[] args) {
        LinkedHashMap lhm=new LinkedHashMap<>();
        lhm.put("name","Abhishek");
        lhm.put("name1","Bbhishek");
        lhm.put("name2","Cbhishek");
        lhm.put("name22","Dbhishek");
        Set ss=lhm.keySet();
        Iterator itrhm=ss.iterator();
        while (itrhm.hasNext()){
            Object o=itrhm.next();
            String st=(String) o;
            System.out.println(st+":"+lhm.get(st));

        }
    }
}
