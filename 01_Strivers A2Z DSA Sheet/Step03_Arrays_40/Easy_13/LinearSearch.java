package Step03_Arrays_40.Easy_13;
//?https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1
public class LinearSearch {
    public static void main(String[] args) {
        
    }
    static boolean searchInSorted(int arr[], int k) {
        for(int element : arr){
            if(element ==k) return true;
        }
        return false;
    }
}
