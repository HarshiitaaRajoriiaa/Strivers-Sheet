package Lec01JavaBasics;

public class NFibbonaciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
        
    }
    public static int fibonacci(int n){
        int left = 1;
		int LoLeft = 1;
		int output = -1;
		if(n==1 || n==2){
			output =1;
		}
		for(int i=3;i<=n;i++){
			output = left + LoLeft;
			LoLeft=left;
			left = output;
			
		}
		
		return output;
    }
}
