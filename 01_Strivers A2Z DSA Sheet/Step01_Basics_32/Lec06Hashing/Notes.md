# HASHING:
### preStoring and hashing
### Number Hashing:
* for finding frequency of any element in the array loop take 0(N) Time complexity and if i need to find 4 elements in the array it will take 4*N and for Q it will take Q*N as TC. which is not an optimized approach.
``` java
int arr[] = { 1,2,3,3,5,1,3,7,9 , 0 };
int N = 9
int arrFreq[] = new int [N+1];
for(int i=0;i<arr.length;i++){
    arrFreq[arr[i]]++;
}
```
*  for int
    * maximum size of an array if storing int is = 10^6.  will give segmentation fault. **inside main**.
    * if make an array globally new int[10^7] will work
* for boolean 
    * maximum size of an array if storing int is = 10^7.  will give segmentation fault. **inside main**.
   * if make an array globally *new int[10^8]* will work
### Char Hashing:
* total 26 characters ignoring cases.
* ASCII values come in now: every character is associated with a integer value in programming as 
* a = 97
* b = 98
* c = 99 
* z = 122
* A = 123
* B = 124 and so on............
``` java
int x = 'a';
// output = 97 typecast will occur
int x = 'c';
int y='e';
System.out.println(y-x);
// output = 2


// HASH ARRAY FOR CHARACTER.
//char-'a'
String name = 'harshita';
int arrFreq[] = new int [26];
for(int i=0;i<s.length()s;i++){
    arrFreq[name.charAt(i) - 'a']++;
}
```
* for lowercase char take ch-'a'
* for upper case char take ch-'A'
* for both take new int[256] and simply typecast the char into string.

## HASH MAP:
* an data structure provided by java collections.
* store items in **"key/value"** pairs, and you can access them by an index of another type (e.g. a String).
* One object is used as a key (index) to another object (value). It can store different types: **String** keys and **Integer** values, or the same type, like: **String** keys and **String** values / key can be any data structure.
``` java
import java.util.hashMap; 
Hashmap<String><String> capitalCities = new HashMap<String, String>();
capitalCities.put("England", "London");
capitalCities.put("Germany", "Berlin");
capitalCities.put("Norway", "Oslo");
capitalCities.put("USA", "Washington DC");
capitalCities.get("England"); // returns London
capitalCities.remove("England");
capitalCities.size();
capitalCities.clear();
```
* .put("key", "value)
* .get( "key')
* .remove( "key')
* .size( )
* .clear( ) 

### Loops through HashMaps:
* forLoop( )
``` java
// Print keys
for (String i : capitalCities.keySet()) {
  System.out.println(i);
}
// Print values
for (String i : capitalCities.values()) {
  System.out.println(i);
}

// Print keys and values
for (String i : capitalCities.keySet()) {
  System.out.println("key: " + i + " value: " + capitalCities.get(i));
}
```
## for Number HashMap will be
``` java
HashMap<Integer><Integer> hash = new HashMap<integer><integer>();
```
## Methods:
1. **division**: number is divided by 10 and remainder is take as key to +1 the value of. let's say for 128 == 128%10 = 8 , key 8 == value 1 . and for 8 chain be formed at the position where key value is 8 like in LL and further using search algorithms frequency of particular value is find.
    * if all the values are chained up on same place like 2 , 122 , 42 , 32 , 92 , 12 ....... , then there will be collision at the place 2
2. **Folding**
3. **Mid Square**