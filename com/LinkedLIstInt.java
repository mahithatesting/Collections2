package Collections.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedLIstInt {
    public static void main(String[] args) {

        LinkedList<Student1> ll=new LinkedList<>();
        // Student s1=new Student("mahitha");
        // another waay of creating objects
        ll.add(new Student1(34)); //Collections.com.Student1@64c64813
        // to convert this out put into original output then use toString()


        Student1 s2=new Student1(25);
        ll.add(s2); //Collections.com.Student1@3ecf72fd

        Iterator it=ll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        LinkedList<String> ll1=new LinkedList<>();
        ll1.add("one");
        ll1.add("two");
        ll1.add("three");
        ll1.add("four");
        ll1.addFirst("zero");
        ll1.addLast("hundred");
        ll1.getFirst();
        ll1.getLast();
        System.out.println(ll1);
    }
}
class  Student1{
    int rollno;
    Student1(int rollno){
        this.rollno=rollno;
    }
    public  String toString(){
        return " "+rollno;
    }
}