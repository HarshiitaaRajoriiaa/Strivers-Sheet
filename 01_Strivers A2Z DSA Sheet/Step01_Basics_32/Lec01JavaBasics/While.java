package Lec01JavaBasics;

//https://www.geeksforgeeks.org/problems/while-loop-printtable-java/1
public class While {
    public static void main(String[] args) {

    }
    static void printTable(int n) {
        int multiplier = 10;
        while (multiplier > 0) {
            // Your code here
            System.out.print(multiplier * n + " ");
            multiplier--;

        }
        System.out.println();
    }
    public static void reverseTable(int n){
        int mul = 10;
        while(mul!=0){
            System.out.print(n*mul + " ");
            mul--;
        }
    }
}
