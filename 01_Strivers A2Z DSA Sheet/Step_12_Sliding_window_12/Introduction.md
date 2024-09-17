# Sliding Window & Two Pointer Approach:
``` java
int left=0;
int right=0;
```
## 1. Constant window:
### example : `check if array has sum n for sub-array of size K: `
``` java 
subArray(int K ,  int n , int arr[]){} 
```
ans:
``` java
public static boolean subArray(int K, int n , int arr[]){
    int l=0;
    int r=K-1;
    //window size is K = constant
    int l = arr.length;
    while(r<l){
        int sum=0;
        for(int i=l;i<=r;i++){
            sum+=arr[i];
        }
        if(sum==n) return true;
    }
    return false;
}
```


