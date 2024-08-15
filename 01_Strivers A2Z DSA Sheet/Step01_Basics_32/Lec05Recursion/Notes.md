## RECURSION:
* function calling itself inside it's own scope.
``` java
class{
    main(){
        print();
    }
    void print(){
        //block of code
        print();
    }
}
```
this function will keep calling itself until a condition is met, which will break the function to run in   infinite loops.
so you need to sto somewhere, which a breaking condition will.
``` java
public static void   print(int num){
        if(num<=0) return;
        System.out.println(num);
        print(num - 1);
    }
//this function will print  4 3 2 1   and stop 
```
### recursion tree:
* first print(4) will execute through main and call print(3) inside it's scope then print(2) will be called inside print(3) and print(1) will be called inside print(2) finally print(1) will be called because print(0) will opposed the base case of print().
* firstly print(4) will be called  print 4 and call print(3) -> print(3) called print 3 and call print(2) -> print(2) called print 2 and call print(1) -> print(1) called print 1 and call print(0) -> print(0) terminated because of base case of print().
``` java
public static void printNumbers(int n) {
        if (n <= 0)  return;
        printNumbers(n - 1);
        System.out.println(n);
    }

    //output = 1 2 3 4
```
### Parametrized and functional recursion:
```java
//Parametrized
public static  void sumOfNTerms(int N , int sum) {
        if(N<=0) {
            System.out.println(sum);
            return;
        }
        sumOfNTerms(N-1 , sum+N);
    }

//functional
public long sumOfSeries(long n) {
        if(n<=0) return 0;
        return (n*n*n) + sumOfSeries(n-1); 
        //waits every time for function to return something and then execute further.
    }
```

### Multiple Recursive calls:
``` java
public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
// firstly fib(n-1) will execute after it's fully execution fib(n-2) will be called and executed.
```