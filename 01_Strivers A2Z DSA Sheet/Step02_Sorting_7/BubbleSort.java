package Step02_Sorting_7;
//?https://www.geeksforgeeks.org/problems/bubble-sort/1
public class BubbleSort {
    public static void main(String[] args) {
        
    }

    // !TC = 0(N*N) approx
    public static void bubbleSort(int a[], int  n  ){
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap the elements
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}


/*
 * Bubble Sort = compare every adjacent element in the array until every element get is placed at it's right place.
 */