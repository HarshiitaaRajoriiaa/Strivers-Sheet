package Step01_Basics.Lec03JavaCollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class JCF {
    public static void main(String[] args) {
        //ARRAY - LIST:
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple"); // Adding elements
        arrayList.add("banana");
        arrayList.add("cherry");
        for (String item : arrayList) {
        // System.out.println(item); // Iterating over elements
        }
        // System.out.println(arrayList);
        

        //LINKED - LIST:
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple"); // Adding elements
        linkedList.add("banana");
        linkedList.add("cherry");
        // for (String item : linkedList) {
        //     System.out.println(item); // Iterating over elements
        // }
        // System.out.println(linkedList);
   
        //VECTOR:
        Vector<String> vector = new Vector<>();
        vector.add("apple");
        vector.add("banana");
        vector.add("cherry");
        vector.add("apple"); // Duplicates are allowed
        // System.out.println("Element at index 1: " + vector.get(1)); // "banana"
        boolean containsCherry = vector.contains("cherry");
        System.out.println("Contains 'cherry': " + containsCherry);
        vector.remove("banana");
        System.out.println("After removing 'banana': " + vector);

        //STACK:
        Stack<String> stack = new Stack<>();
        stack.push("apple");
        stack.push("banana");
        stack.push("cherry");
        System.out.println("Top element: " + stack.peek()); // "cherry"
        System.out.println("Popped element: " + stack.pop()); // "cherry"
        System.out.println("Top element after pop: " + stack.peek()); // "banana"
        boolean isEmpty = stack.empty();
        System.out.println("Is stack empty? " + isEmpty);
        int position = stack.search("apple");
        System.out.println("Position of 'apple' in stack: " + position); // 2

        }


}

