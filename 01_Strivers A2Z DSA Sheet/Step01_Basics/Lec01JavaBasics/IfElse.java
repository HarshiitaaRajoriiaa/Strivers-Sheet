package Lec01JavaBasics;
//https://www.geeksforgeeks.org/problems/java-if-else-decision-making0924/0?category%255B%255D=Java&difficulty%255B%255D=-2&page=1&query=category%255B%255DJavadifficulty%255B%255D-2page1category%255B%255DJava
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
