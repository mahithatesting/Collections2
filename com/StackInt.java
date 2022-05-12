package Collections.com;

import java.util.Stack;

public class StackInt {
    public static void main(String[] args) {
  // lifo
        Stack<Integer> ss=new Stack<>();
        ss.push(5);
        ss.push(4);
        ss.push(3);
        ss.push(2);
        ss.push(1);
        System.out.println(ss.pop());
        System.out.println( ss.peek());
        System.out.println(    ss.search(4)); // 5th position lo m unte adhe
        System.out.println(       ss.empty());
    }
}
