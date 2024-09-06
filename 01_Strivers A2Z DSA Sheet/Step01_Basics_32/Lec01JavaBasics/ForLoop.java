package Lec01JavaBasics;
import java.util.Scanner;
//https://www.naukri.com/code360/problems/nth-fibonacci-number_74156
public class ForLoop {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //start from 1 as: F(1) = 1 , F(2) = 1
        if (n == 1 || n == 2) {
            System.out.println(1);
            return ;
        }
		int previous = 1; 
        int prePrevious = 1; 
        int current = 0;
		for(int i=3;i<=n;i++){
			current = previous + prePrevious; 
            prePrevious = previous; 
            previous = current;
		}
		System.out.println(current);
        scanner.close();
	}

}
