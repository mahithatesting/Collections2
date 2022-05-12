package Collections.com;

import java.util.Vector;

public class VectorInt {
    public static void main(String[] args) {
     // vector is similarto arraylist
        // difference to btw vector and arraylist
        // capacity
        Vector v=new Vector(); // initial capacity is 10

        v.add("Abhisek");
        v.add("Abhisek");
        v.add("Abhisek");
        v.add("Abhisek");
        v.add("Abhisek");
        v.add("Abhisek");
        v.add("Abhisek");
        v.add("Abhisek");
        v.add("Abhisek");
        v.add("Abhisek");
        v.add("Abhisek");
        v.add("Abhisek");  // now capacity 20 when 10 fills then it create other 10 it doubles or it increase 100%

    // we can provide our own  capacity
        Vector v1=new Vector(2 , 15); // values ichesaka dani capacity double avvthadi by default ala kakund we can change the value by increment
        v1.add("Abhisek");
        v1.add("Abhisek");
        v1.add("Abhisek");
        System.out.println(v.capacity());
        System.out.println(v1);
        System.out.println(v1.capacity()); // emmo elements store chesukogaladhu
        // dont confuse with capacity and size ()
        System.out.println(v1.size());// present enni elements unnai

    }
}
