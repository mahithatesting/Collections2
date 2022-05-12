package Collections.com;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add(10);
        lhs.add(5);
        lhs.add(24);
        lhs.add(10); //output---10,5,24 because insertion order is preserver duplicates are not allowed
        System.out.println(lhs);
        Iterator lhst=lhs.iterator();
        while (lhst.hasNext()){
            System.out.println(lhst.next());

        }
    }
}
