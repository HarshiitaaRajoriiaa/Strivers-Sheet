package Lec01JavaBasics;

public class ReverseTable {
    public static void main(String[] args) {
        reverseTable(3);
        
    }
    public static void reverseTable(int n){
        int mul = 10;
        while(mul!=0){
            System.out.print(n*mul + " ");
            mul--;
        }
    }
}
