package Lec01JavaBasics;

import java.util.Scanner;

public class NFibbonaciNumber {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n == 1 || n == 2) {
            System.out.println(1);
            return;
        }
		int f1 = 1; 
        int f2 = 1; 
        int curr = 0;
		for(int i=3;i<=n;i++){
			curr = f1 + f2; 
            f1 = f2; 
            f2 = curr;
		}
		System.out.println(curr);
	
	}
}
