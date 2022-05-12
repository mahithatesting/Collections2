package Collections.com;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetw {


    public static void main(String[] args) {
        HashSet<String> hs= new HashSet<>();
        hs.add("Mahitha");
        hs.add("Nani");
        hs.add("chintu");
        System.out.println(hs);  // output chintu mahitha nani because of hashcode
        Iterator ith=hs.iterator();
        while(ith.hasNext()){
            System.out.println(ith.next());
        }
    }
}

