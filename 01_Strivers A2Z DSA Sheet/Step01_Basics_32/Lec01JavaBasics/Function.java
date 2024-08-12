package Lec01JavaBasics;

public class Function {
    public static void main(String[] args) {
        int a= 0;
        int b =a;// ?a passed by value to b
        b++;
        System.out.println(a  );
        System.out.println(b  );
        System.out.println(passedBy(1, 2));

        int x = 5;
        int y = change(x);
        System.out.println(y);
        System.out.println(x);
        
    }
    static int[] passedBy(int a, int b) {
        // code here
        //?a by value and b by reference 
        int ma = a+1;
        int barray[] = {b};
        reference(barray);
        
        int result[] = { ma,barray[0]};
        return result;
    }
    public static void  reference( int array[]){
            array[0] += 2;
    }

    /* 
     * here in this function only copy of x goes and change() modified copy of x and return modified x but in main x remains same as it was earlier.
     * in JAVA only passed by value , happens with primitive data structure, but with non-primitive like: Arrays, LL and etc passed by reference is possible.
     */
    public static int change(int x) {
        x = 10; 
        return x;
        
    }
}

