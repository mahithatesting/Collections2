package Collections.com;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(1000);
        ts.add(1);
        ts.add(5);
        ts.add(45);
        Iterator its= ts.iterator();
        while (its.hasNext()){
            System.out.println(its.next()); // 1 5 45 1000
        }
        // to get output in descending
        // by using descendingIterator();
        Iterator its1= ts.descendingIterator();
        while (its1.hasNext()){
            System.out.println(its1.next()); //1000 45 5 1
        }
    }
}
