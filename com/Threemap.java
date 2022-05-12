package Collections.com;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.Set;

public class Threemap {
    // prints in sorted order in alphabetical order
    public static void main(String[] args) {
        TreeMap ltm=new TreeMap<>();
        ltm.put("name","Abhishek");
        ltm.put("name22","Dbhishek");
        ltm.put("name1","Bbhishek");
        ltm.put("name2","Cbhishek");

        Set sss=ltm.keySet();
        Iterator ttr= sss.iterator();
        while (ttr.hasNext()){
            Object os=ttr.next();
            String s3=(String)os;
            System.out.println(s3+":"+ltm.get(s3));



        }
    }
}
//name:Abhishek
//name1:Bbhishek
//name2:Cbhishek
//name22:Dbhishek