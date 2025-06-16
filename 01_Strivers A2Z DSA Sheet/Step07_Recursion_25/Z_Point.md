in recursion we have to remember:
1. TC = (no. of recursive calls) * (no. of operations in each call.)
```java
public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n<0){
            x = 1/x;
            n = -n;
        }
        1 way 
        /* 
        * liner recursion tree height of tree = log(N)
        * TC = 0(log(n))
         */
        double half = myPow( x , n/2);
        if( n%2==0) return half*half;
        return half*half*x;


        2 way
        /*
        * TC = 0(N)
        * height of recursion tree = log(N) , no of nodes in n level = 2^n
         */
        if( n%2==0) return myPow( x , n/2)*myPow( x , n/2);
        return myPow( x , n/2)*myPow( x , n/2)*x;
    }

```
as in this code in 1 way there is linear recursion tree and each level only one node is their and TC  become  log2(N) but in 2 way tree is non-linear and every level has 2^n(level) nodes  which make 2^0 2^1 2^2 .......log2(n) and TC become 0(N).


2. Space complexity = depth of recursion * space used in each recursive call.