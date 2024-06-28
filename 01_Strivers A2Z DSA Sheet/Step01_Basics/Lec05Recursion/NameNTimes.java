package Lec05Recursion;

public class NameNTimes {
    public static void main(String[] args) {
        name(5);
        
    }
    public static void name(int N){
        if(N>0){
            System.out.print("Name  ");
            name(N-1);
        }
    }
}
