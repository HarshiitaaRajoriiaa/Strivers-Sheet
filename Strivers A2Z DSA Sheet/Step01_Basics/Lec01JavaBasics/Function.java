package Lec01JavaBasics;

public class Function {
    public static void main(String[] args) {
        int a= 0;
        int b =a;// a passed by value to b
        b++;
        System.out.println(a  );
        System.out.println(b  );
        System.out.println(passedBy(1, 2));
        
    }
    static int[] passedBy(int a, int b) {
        // code here
        int ma = a+1;
        int barray[] = {b};
        reference(barray);
        
        int result[] = { ma,barray[0]};
        return result;
    }
    public static void  reference( int array[]){
            array[0] = array[0] + 2;
        }
}
