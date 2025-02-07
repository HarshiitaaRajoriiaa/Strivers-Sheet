public class PascalsTriangle {
    //three types of question
    public  int nCr(int n , int r){
        int ans=1;
        for(int i = 0 ;i <r;i++){
            ans *= n-i;
            ans /= i+1;
        }
        return ans;
    }

    // *single element
    public int pascalSingle(int rowNumber, int columnNumber){
        return nCr(rowNumber, columnNumber);
    }
    //* entire row 
    public int[] pascalRow(int rowNumber){
        int row [] = new int[rowNumber];
        for(int i = 1; i<= rowNumber;i++){
            row[i] = nCr(rowNumber , i);
        }
        return row;
    }
    //* entire triangle
    public int[][] pascalTriangle(int rowNumber){
        int [] [] triangle = new int[rowNumber] [rowNumber];
        for(int i = 0; i < rowNumber; i++){
            triangle[i] = pascalRow(i);
        }
        return triangle;
    }

}
