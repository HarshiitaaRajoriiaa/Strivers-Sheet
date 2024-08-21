package Step03_Arrays_40.Easy_13;
import java.util.*;
//?https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1358465154/
public class RemoveDuplicate {
    public static void main(String[] args) {
        
    }
    //! using two pointers
    //TC = 0(N)
    public int removeDuplicates(int[] nums) {
        int counter = 1;
        int index = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]) {
                counter++;
                nums[index] = nums[i];
                index++;
            }
        }
        return counter;
    }
    //todo output = nums.length , nums[] with no duplicates elements and left with zero.

    //!using hashset TC = 0(N)  and SC = 0 (N)
    public static int removeDuplicatesUsingHashSet(int arr[]){
        Set<Integer> set = new HashSet<>();
        int i = 0;
        for(int num : arr){
            if(!set.contains(num)){
                set.add(num);
                arr[i] = num;
                i++;
            }
        }
        return i;
    }
    

}
