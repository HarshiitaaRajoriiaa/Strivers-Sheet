package Lec01JavaBasics;

public class IfElse {
    public static void main(String[] args) {
        System.out.println(compareNM(2,4));
        
    }
    public  static String compareNM(int n, int m) {
        String ans= "";
        if( n > m ){
            ans ="greater";
        }
        else if(n==m){
            ans = "equal";
        }
        else{
            ans = "lesser";
        }
        return ans;
    }
}
