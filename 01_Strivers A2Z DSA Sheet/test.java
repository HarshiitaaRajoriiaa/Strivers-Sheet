import java.util.*;
public class test {
    public static void main(String[] args) {
        int arr [] = { 1,3,4,5,7,9,0};
        HashMap<Integer , Integer> prefixSum = new HashMap<>();
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
            prefixSum.put(i , sum);
        }
        for (int i : prefixSum.keySet()) {
            System.out.println(i +  " " +  prefixSum.get(i));
        }
    }

}
