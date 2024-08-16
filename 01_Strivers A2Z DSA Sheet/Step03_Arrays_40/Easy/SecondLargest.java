package Step03_Arrays_40.Easy;
import java.util.List;
//?https://www.geeksforgeeks.org/problems/second-largest3735/1
public class SecondLargest {
    public static void main(String[] args) {
        
    }
    public int print2largest(List<Integer> arr) {
        // Code Here
        if (arr == null || arr.size() < 2) {
            return -1; // Or throw an exception, depending on your requirements
        }
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > firstLargest) {
                firstLargest = num;
            }
        }
        for (int num : arr) {
            if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            return -1; // Or handle it differently if needed
        }

        return secondLargest;

    }
}
