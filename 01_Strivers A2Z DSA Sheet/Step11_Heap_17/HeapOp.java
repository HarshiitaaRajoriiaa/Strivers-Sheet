import java.util.*;

public class HeapOp {
    public class MaxHeap {
        List<Integer> Heap;
        int size;

        public MaxHeap() {
            Heap = new ArrayList<>();
        }

        public MaxHeap(int arr[]) {
            // todo build Heap with given set of elements
            Heap = new ArrayList<>();
            for (int el : arr) {
                Heap.add(el);
            }

            for (int i = (arr.length - 1) / 2; i >= 0; i--) {
                Heapify(i);
            }

        }

        public int peek() {
            return Heap.get(0);
        }

        // *HEAPIFY */ = Tc0(logn)| height of CBT.
        // process of adjusting the order of elements and make them follow heap rules
        // ? MIN HEAP= all the child nodes will be smaller or equal to their parent node
        // ? MAX HEAP= all the child nodes will be greater or equal to their parent node

        public void Heapify(int index) {
            // for the given index check, whether it is following heap rules or not and if
            // not then swap the elements accordingly

            size = Heap.size();
            if (size == 0)
                return;
            int largest = index; // just assuming that root node is largest and checking for further rules.
            while (index < size) {
                int left = index * 2 + 1;
                int right = index * 2 + 2;
                if (left < size && Heap.get(left) > Heap.get(largest))
                    largest = left;
                if (right < size && Heap.get(right) > Heap.get(largest))
                    largest = right;
                if (largest != index) {
                    Collections.swap(Heap, largest, index); // assumpution is wrong swap the elements
                    index = largest; // index will be swapped element and now checking will go further
                } else {
                    break;
                }
            }

        }

        // * INSERTION */
        // ? add the element at the end of array or you say end of binary tree
        // ? bubble it up and keep swapping with parent if it's violate the heap rules.

        public void insert(int curr) {
            // insert at last and check for parent-child rules and swap if needed.
            Heap.add(curr);
            int index = Heap.size() - 1;
            while (index > 0) {
                int parent = (index - 1) / 2;
                if (Heap.get(parent) < curr) {
                    Collections.swap(Heap, curr, parent);
                    index = parent;
                } else {
                    break;
                }

            }

        }

        // *DELETION */
        // ? from max heap = delete the root, add last element in the heap at root's
        // place and run heapify
        // return maximum element and delete it from the Heap
        public int pop() {
            size = Heap.size();
            if (size == 0)
                return 0;

            int max = size - 1;
            size--;
            Heap.set(0, Heap.get(max)); // * */ swapping the last element from the heap

            // todo check for rule violation
            Heapify(0);

            // pop part
            return Heap.get(max);

        }
    }

    public class MinHeap {
        List<Integer> Heap;

        public MinHeap() {
            Heap = new ArrayList<>();
        }

        public MinHeap(int arr[]) {
            Heap = new ArrayList<>();
            for (int el : arr) {
                Heap.add(el);
            }

            for (int i = (arr.length - 1) / 2; i >= 0; i--) {
                Heapify(i);
            }
        }
    

        //return the minimum element of Heap
        public int peek(){
            int size = Heap.size();
        }
    
    
    }

}