import java.util.*;

public class test {
    public static void main(String[] args) {
        System.out.println("hello");
    }


    //Recursion
    public static int min(int cost[]){
        int min=Integer.MAX_VALUE;
        int n=cost.length;
        if(n==2) return Math.abs(cost[1]-cost[0]);
        if(n==1) return Math.abs(cost[0]);
        if(n==0) return 0;

        
        
    }
    
    

}
