package Step03_Arrays_40.Medium_14;
//?https://leetcode.com/problems/sort-colors/description/
public class Sortcolor {
    public static void main(String[] args) {
        
    }
    // *BETTER APPROACH: iterate over the array and count for each element.
    //! TC =0(2N) approximately
    public static void sort(int arr[] , int n){
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) zero++;
            else if (arr[i] == 1) one++;
            else if (arr[i] == 2) two++;
        }
        for (int i = 0; i < zero; i++) arr[i] = 0;
        for (int i = zero; i < zero + one; i++) arr[i] = 1;
        for (int i = zero + one; i < n; i++) arr[i] = 2;
    }

    // *OPTIMAL APPROACH:
    //Dutch National Flag Algorithm //todo DNF
    // 3 pointers:
    public static void sortColor(int arr[] , int n){
        int low;
        int mid;
        int high;
    }
}
