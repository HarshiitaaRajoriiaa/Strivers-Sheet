package ConstantSize;

public class SubArraysWithK {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,5,6};
        System.out.println(subArraysWithK(arr, 3, 6));
    }

    //! TC=0(N)
    public static int subArraysWithK(int a[] , int size , int sum){
        int l=0;
        int r=size-1;
        int count=0;
        int summ=0;
        for(int i=0;i<=r;i++){ //!Tc =)(K)
            summ +=a[i];
        }
        // System.out.println(summ);
        while(r<a.length-1){ //!TC =0(N-K)
            if(summ==sum) count++;
            summ -=a[l];
            l++;
            r++;
            summ +=a[r];

        }
        // System.out.println();
        return count;
    }
}
