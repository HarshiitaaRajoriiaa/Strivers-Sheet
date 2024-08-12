# Binary Search:
* 1. Lower bound = first index where a[i] >=x
* 2. Upper bound = first index where a[i] > x.

### example 1:
```java
int arr[] = { 1,2,3,4,8,8,8,8,9,10};
```
* when x = 8 / value to find
* given sorted array of integers
* up(8) = arr[i] >=8 which is equivalent to 4 and
* lb = first index of 8 = 4
* lb(8) = arr[i] > 8 which is equivalent to 8 === arr[8] = 9 / first element which is greater than x hence *lb-1* is last index of 8 in the array.
### example 2:
```java
int arr[] = { 1,4,8,8,8,8,9};
```
* value to find = 6
* in this case lb will be 3 and you can see arr[3] = 8 != 6.

### example 3:
```java
int arr[] = { 1,4,8,8,8,8,9};
```
* value to find = 10
* in this case lb will be 10 and you can see arr[7], a hypothetical index is returned.


### In last  both the cases where value to find is not present in the array but lb is returning something. in these kind of cases we have to kind for further base cases
``` java
* (arr[lb] == x && arr[lb] <= arr.length-1)
// or
if(arr[lb]) !=x  || arr[lb] == arr.length){
   // lb is wrong and value to find is not present in array.
}
```
* arr[lb] should strictly equal to value to find and should be inside the bound of array.



