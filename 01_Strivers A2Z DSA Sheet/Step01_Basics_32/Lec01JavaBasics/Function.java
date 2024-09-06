package Lec01JavaBasics;

public class Function {
    public static void main(String[] args) {
        int a= 0;
        int b =a;// ?a passed by value to b
        b++;
        System.out.println(a  );
        System.out.println(b  );
        System.out.println(passedBy(1, 2));

        int x = 5;
        int y = change(x);
        System.out.println(y);
        System.out.println(x);
        
    }
    static int[] passedBy(int a, int b) {
        // code here
        //?a by value and b by reference 
        int ma = a+1;
        int barray[] = {b};
        reference(barray);
        
        int result[] = { ma,barray[0]};
        return result;
    }
    public static void  reference( int array[]){
            array[0] += 2;
    }

    /* 
     * here in this function only copy of x goes and change() modified copy of x and return modified x but in main x remains same as it was earlier.
     * in JAVA only passed by value , happens with primitive data structure, but with non-primitive like: Arrays, LL and etc passed by reference is possible.
     */
    public static int change(int x) {
        x = 10; 
        return x;
    }
}

//!  Primitive Data Structures: These are basic data types provided by programming languages. They are fundamental building blocks for data manipulation.
// *Integer (int) – Stores whole numbers (e.g., 5, -100)
// *Float (float, double) – Stores decimal numbers (e.g., 3.14, -7.5)
// *Character (char) – Stores a single character (e.g., 'A', 'b')
// *Boolean (bool) – Stores either true or false
// *String – Often considered primitive (though technically not always), stores a sequence of characters (e.g., "Hello", "World")

// !Non-Primitive Data Structures: These are more complex and are derived from primitive data types.
//? Linear Data Structures:
// *Array – A collection of elements of the same type, stored in contiguous memory locations.
// *Linked List – A sequence of elements (nodes), where each node points to the next node.
// *Stack – A collection of elements with Last In First Out (LIFO) access.
// *Queue – A collection of elements with First In First Out (FIFO) access.
// ?Non-Linear Data Structures:
// *Tree – A hierarchical structure with nodes connected by edges, with a single root node.
// *Binary Tree, Binary Search Tree, AVL Tree, etc.
// *Graph – A set of nodes (vertices) connected by edges, either directed or undirected.
// ?Other:
// *Hash Table / Hash Map – A collection of key-value pairs, where data is accessed by keys.
// *Set – A collection of unique elements (no duplicates allowed).
