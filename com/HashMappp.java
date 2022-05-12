package Collections.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class HashMappp {
    public static void main(String[] args) {
        HashMap<java.lang.String, Integer> hmm=new HashMap();
        // to add use put();
        hmm.put("name",1);
        hmm.put("name1",11);
        hmm.put("name2",12);
        hmm.put("name3",13);
        hmm.put("name4",14);
        hmm.put("name4",14);
        hmm.put("name4",19);  // duplicate keys iste last duplicate key value print avvudhi
        hmm.remove("name4"); // here pass key value
        // to get value we use getmethod
        // clear() size() isEmpty keySet();

        System.out.println(hmm.get("name")); //1




        System.out.println(hmm);//{name4=14, name3=13, name=1, name2=12, name1=11} duplicates are not allowed
        hmm.keySet(); // no index position in map so we take help of keys but enni keys unnayi anadhi telidu kada so keySet tho anni hash map lo enni keys uunayo anni retrieve chesukovach
        Set s=hmm.keySet();
        Iterator hmt=s.iterator();
        while(hmt.hasNext()) {
            // we need key and value so we need object
            Object obj = hmt.next();
            // but we cannot print object directly so converting it to string
            // we need type castimg
            String str=(String) obj;
            System.out.println("string"+str);
            // to print key n value
            System.out.println(str+" : "+ hmm.get(str)); // key ki sambandinchina value

        }
    }
}
