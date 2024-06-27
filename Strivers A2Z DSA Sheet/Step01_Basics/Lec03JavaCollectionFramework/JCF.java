package Step01_Basics.Lec03JavaCollectionFramework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
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

        //TREESET:
        Set<String> set1 = new TreeSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");
        set1.add("apple"); // Duplicate element, will not be added
        for (String item : set1) {
            System.out.println(item); // Iterating over elements
        }

        //HASHSET:
        Set<String> set2 = new HashSet<>();
        set2.add("apple");
        set2.add("banana");
        set2.add("cherry");
        set2.add("apple"); // Duplicate element, will not be added
        for (String item : set2) {
            System.out.println(item); // Iterating over elements
        }
        //LINKEDHASHSET:
        
        Set<String> set3 = new LinkedHashSet<>();
        set3.add("apple");
        set3.add("banana");
        set3.add("cherry");
        set3.add("apple"); // Duplicate element, will not be added
        for (String item : set3) {
            System.out.println(item); // Iterating over elements
        }
        //QUEUE , DEQUEUE, PRIORITY QUEUE:
         Queue <String> q = new LinkedList<>();
         Deque <String>d = new ArrayDeque<>();
         PriorityQueue<String> pq=new PriorityQueue<>();  

        //HASH MAP:
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1); // Adding key-value pairs
        hashMap.put("banana", 2);
        hashMap.put("cherry", 3);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue()); // Iterating over key-value pairs
        }

        //TREEMAP:
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", 1); // Adding key-value pairs
        treeMap.put("banana", 2);
        treeMap.put("cherry", 3);



        }


}

