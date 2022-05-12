package Collections.com;

import java.util.*;

public class ArrayListint {
//    duplicates are allowed
    // insertion order is preserved


    public static void main(String[] args) {

        List<java.lang.String> al = new ArrayList<>();
        al.add("Mahitha");
        al.add(1, "anusha");
        al.add("Madhuri");
        al.add("Deepika");
        var venkat = al.add("venkat");
        al.add("venkat");


        System.out.println(al);
        List<java.lang.String> al1 = new ArrayList<>();
        al1.addAll(al);
        System.out.println(al1);
        System.out.println(al.get(2));
        System.out.println(al.isEmpty());
        System.out.println(al.contains("mahitha"));

        System.out.println(al.lastIndexOf("madhuri"));
        System.out.println(al.lastIndexOf("venkat"));
        //System.out.println(al.toArray());
        System.out.println(al);
//        System.out.println(al.sort(););
        System.out.println(al.indexOf("madhuri"));
        System.out.println(al.remove(1));
        System.out.println(al.remove("madhuri"));
        System.out.println(al.set(2, "manaswitha"));
        System.out.println(al);
//        System.out.println("sublist"+al.subList(3,5));
        System.out.println(al.size());
        System.out.println("****for loop*****");

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i)); // to print value we need index with get method
        }

        // List iterator

        ListIterator<java.lang.String> itr=al.listIterator();
        System.out.println("******forward and backward direction*********");
        for (java.lang.String result: al) {
            System.out.println(result);
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        }
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }

        System.out.println( "jiteerator interface");
        Iterator itr1=al.iterator();
        while (itr.hasNext()) {

            System.out.println(itr.next());
        }
        System.out.println("foreach() with lamda expression");
        al.forEach(result->{
            System.out.println(result);
        });
        System.out.println("foreach remaining() with lamda expression but we need to create iterator");

        itr1.forEachRemaining(result->{
            System.out.println(result);
        });
        al.clear();
        System.out.println(al);
        System.out.println("equals method to compare the values of list in list item must be in same order");
        System.out.println(al.equals(al1));
        System.out.println(" to check whether the list is empty or not");
        System.out.println(al.isEmpty());
        System.out.println(al.lastIndexOf("vasamtja"));
        System.out.println(al.indexOf("fkkf"));

        System.out.println(  al1.remove("madhuri"));
        // to make upper or lower case
        System.out.println("case");
        al.sort(String.CASE_INSENSITIVE_ORDER); // not getting output
        System.out.println(al);
        al.sort(Comparator.naturalOrder()); // first upper case and second lower case letters

    }
    }
