package Collections.com;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithObject {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        Student s1=new Student(10,"mahi","Hyderabad");
        Student s2=new Student(101,"mahi1","Hyderabad1");
        Student s3=new Student(102,"mah2i","Hyderabad2");

        System.out.println(   list.add(s1));
        System.out.println(   list.add(s1));
        System.out.println(   list.add(s1));
        for (Student s:list){
            System.out.println(s.rollno+"its is my roll no"+s.name+" its my name"+s.address+"address");
        }
    }
}
class  Student{
    int rollno;
    String name, address;
    Student(int rollno,
            String name,
            String address
    ){
        this.address=address;
        this.name=name;
        this.rollno=rollno;
    }
}