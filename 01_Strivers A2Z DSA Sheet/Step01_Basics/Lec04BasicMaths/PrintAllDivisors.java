package Lec04BasicMaths;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisors {
    public static void main(String[] args) {
        
    }
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        ArrayList<Integer> sol = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sol.add(i);
            }
        }
        return sol;
    }
}
