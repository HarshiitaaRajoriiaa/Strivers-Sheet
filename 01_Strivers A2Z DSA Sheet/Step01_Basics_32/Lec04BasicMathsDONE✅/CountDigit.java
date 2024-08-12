package Lec04BasicMaths;
//https://www.geeksforgeeks.org/problems/count-digits5716/1
public class CountDigit {
    public static void main(String[] args) {
        System.out.println(evenlyDivides(123));
    }
    public static int evenlyDivides(int N){
        // code here
        int n1 = N;
        int count=0;
        while(n1>0){
            int curr = n1%10;
            if( curr != 0 && N%curr==0) count++;
            n1/=10;
        }
        return count;
    }
}
