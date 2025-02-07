import java.util.ArrayList;

public class MissingAndTwice{
    public static void main(String[] args){

    }
    // *BRUTE FORCE APPROACH-
    //! TC = 0 (n^2)
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int missing =0; 
        int twice = 0;
        for(int i = 1 ; i <=arr.length;i++){
            int counter =0;
            for(int j = 0 ; j <arr.length;j++){
                if(arr[j] == i ) counter++;
            }
            if(counter== 2) twice =  i;
            if(counter==0) missing = i;
            break;
        }
        ans.add(twice);
        ans.add(missing);
        return ans;
    }
    

    // *OPTIMIZED APPROACH-
     //! TC=0(n)
    ArrayList<Integer> findTwoElementOptimized(int arr[]) {
        int missing = 0;
        int twice = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        // Collections.fill(ans , 0);
        int hash[] = new int[arr.length+1];
        for(int element : arr){
            hash[element]++;
        }
        for(int i = 1;i<hash.length;i++){
            if(hash[i]==0) missing = i ; 
            if(hash[i] ==2) twice = i;
        }
        ans.add(twice);
        ans.add(missing);
        return ans;
    }
}