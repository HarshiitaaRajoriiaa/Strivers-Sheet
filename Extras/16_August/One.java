//?https://leetcode.com/problems/maximum-69-number/?envType=daily-question&envId=2025-08-16
public class One{
    public static void main(String[] args) {
        
    }
     public int maximum69Number(int num) {

        //*brute force
        StringBuilder n = new StringBuilder(String.valueOf(num));
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '6') {
                n.setCharAt(i, '9'); // change the first '6' to '9'
                break; // only one change allowed
            }
        }
        // return Integer.valueOf(n.toString());



        //*Inbuild function
        String n1 = String.valueOf(num);
        n1 = n1.replaceFirst("6", "9"); // replace only the first '6'
        // return Integer.parseInt(n);




        //* Maths
        int orignal = num;
        int pos=-1;
        int i=0;
        while(num>0){
            if((num%10)==6) pos=i;
            i++;
            num/=10;
        }
        //original + 3*(int)Math.pow(10,pos);
        return orignal + 3*(int)Math.pow(10,pos);

    }
}