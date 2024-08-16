## 1. In java String can't be compared using "==" operator
``` java
string1 == string2  
// it is not possible to compare because in java String, String holds the address of the memory location  along with value.
```
that's why in String 
``` java 

string.equals(string) 
// is used to compare  two strings
//Boolean value returned true/false
```
* equalsIgnoreCase() : give true when two string are equal and ignore case. === [SACHIN == sachin]
* string.compare() : lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.
examples:
``` java
   String s1="Sachin";  
   String s2="Sachin";  
   String s3="Ratan";  
   System.out.println(s1.compareTo(s2));//0  
   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
```
## 2. ArrayList<>: not fixed array type
``` java
import java.util.ArrayList;
import java.util.Collections;  
```
* arrayList.get(i) :  returns value at i index in arrayList.
* arrayList.set(i , value) : sets value at i index in arrayList
* arrayList.add(i) : adds value at end of arrayList
* arrayList.add(i, value) : sets value at i index in arrayList
*arrayList.addAll(i , Collection) : adds all of the items from a collection to the list.
```java
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    ArrayList<String> brands = new ArrayList<String>();
    brands.add("Microsoft");
    brands.add("W3Schools");
    sbrands.add("Apple");
    
    brands.addAll(1, cars);
    
    System.out.println(brands);
  }
}

//output = [Microsoft, Volvo, BMW, Ford, Mazda, W3Schools, Apple]
 ```
* arrayList.clone() : returns a copy of the ArrayList as an Object.
``` java 
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    ArrayList cars2 = (ArrayList)cars.clone();
    cars2.set(0, "Toyota");
    
    System.out.println(cars);
    System.out.println(cars2);
  }
}

// output : [Volvo, BMW, Ford, Mazda]
// [Toyota, BMW, Ford, Mazda]
```
* arrayList.remove(i) : removes value at i index in arrayList
* arrayList.remove() : removes  all value of arrayList
* arrayList.size() : returns number of elements in arrayList
* Collections.sort() : sorts arrayList by value
* arrayList.index() : returns number of elements in arrayList
* arrayList.isEmpty(): returns true if arrayList is empty
* arrayList.replaceAll( value ): replaces arrayList with value
* arrayList.contains( value) : returns true if arrayList contains value
..........
[link for more information](https://www.w3schools.com/java/java_ref_arraylist.asp)
## 3. Fibonacci sequence:
* 1 1 2 3  5  8 13....
* f(n)= f(n-1) + f(n-2) 
## 4. Pass by reference and pass by value:
* in java, primitive data types are passed by value , which means that only value is passed in function and if function is modify the value of passed variable, then there will be no changes in the value of passed variable. but in non primitive data types value is passed by reference which means along with value their address is passed by reference too, so while modifications by function value of passed variable is changed. 
## 5.  Time complexity:
* The rate at which the time, required to run a code, changes with respect to the input size, is considered the time complexity. Basically, the time complexity of a particular code depends on the given input size, not on the machine used to run the code.
* Best Case: best scenario refers to the case where the code takes the least amount of time to get executed
* worst case : worst scenario refers to the case where the code takes the maximum amount of time to get executed.
* avg case :  the case between the best and the worst.
## 6. GCD and LCM:
* a*b = gcd(a, b) * lcm(a, b)
* gcd(a, b) = gcd(a , a%b) EUCLIDEAN THEORY
## 7. String:
* character.isLetterOrDigit( value ):  returns true if the value contains letters or digits
### 8. Array:
* in main() array of int dType can be of 10^6 size maximum. and globally 10^7 is possible

