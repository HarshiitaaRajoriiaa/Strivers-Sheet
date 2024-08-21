package Step03_Arrays_40.Easy_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//?https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
public class UnionOfArray {
    public static void main(String[] args) {

    }

    // *BRUTE FORCE METHOD: TC=O((n+m)log(n+m))
    // *SC=0(2(N+M))
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]); // nlogn
        }
        for (int i = 0; i < m; i++) {
            set.add(arr2[i]); // mlogm
        }

        // n+m
        ArrayList<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
    }

    // * OPTIMAL APPROACH / TWO P0INTERS: TC=0(N+M)
    public static ArrayList<Integer> union(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            } else { // arr1[i] == arr2[j]
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while (i < n) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }
        while (j < m) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }

        return list;
    }

}
