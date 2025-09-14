//?https://leetcode.com/problems/top-k-frequent-elements/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeFourtySeven {
    //*optimal - bucket sort | hashmap |
     public int[] topKFrequent(int[] nums, int k) {
        //stage one: couting the frequency and storing it in hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        int  n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
            //put all the elements present in the array with their frequency.
        }


        //array of list to make and store at index i = elements with frequency i
        List<Integer> bucket[] = new ArrayList[n+1];
        for(int i=0;i<n+1;i++){
            bucket[i] = new ArrayList<>();
            //empty arraylist initialised in array
        }
        for(Map.Entry<Integer, Integer>  entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            bucket[value].add(key);
        }


        //list of frequency in decreasing order.
        List<Integer> ans = new ArrayList<>();
        for(int i=bucket.length-1 ; i>=0 ;i--){
           if(!bucket[i].isEmpty()) ans.addAll(bucket[i]);
        }

        int result [] = new int[k];
        for(int i=0;i<k;i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}
