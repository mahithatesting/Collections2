package Collections.com;

import java.util.ArrayList;
import java.util.Collections;

public class ImpMethods {
    public static void main(String[] args) {
        ArrayList all=new ArrayList<>();
        all.add(56);
        all.add(606);
        all.add(77);
        all.add(88);
        System.out.println(all); //[56, 606, 77, 88]
        Collections.sort(all);
        System.out.println(all); //[56, 77, 88, 606]
        Collections.sort(all);
        Collections.reverse(all);
        System.out.println(all);
        Collections.swap(all,1,2);
        Collections.min(all);
        Collections.max(all);



    }
}
