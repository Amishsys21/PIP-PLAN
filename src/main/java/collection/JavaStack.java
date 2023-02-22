package main.java.collection;

import java.util.Stack;

public class JavaStack {
    //LIFO
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.add("animal");
        stack.add("cat");
        stack.add("cow");
        stack.add("crow");
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }
}
