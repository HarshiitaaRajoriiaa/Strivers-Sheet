//?https://leetcode.com/problems/diagonal-traverse/description/?envType=daily-question&envId=2025-08-25
class Leetcode498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; // number of rows
        int n = mat[0].length; // number of columns
        int[] result = new int[m * n];
        if (m == 0 && n == 0) {
            result[0] = mat[0][0];
            return result;
        }

        if (m == 1) {
            for (int i = 0; i < n; i++)
                result[i] = mat[0][i];
            return result;
        }
        if (n == 1) {
            for (int i = 0; i < m; i++)
                result[i] = mat[i][0];
            return result;
        }

        result[0] = mat[0][0];

        int row = 0, col = 1;
        int dir = -1;
        int index = 1; // index for result array

        // traverse all elements
        while (index < m * n) {
            result[index++] = mat[row][col];
            // moving up-right (↗)
            if (dir == 1) {
                if (col == n - 1) { // if we are at last column
                    row++; // go down
                    dir = -1; // change direction to down-left
                } else if (row == 0) { // if we are at first row
                    col++; // go right
                    dir = -1; // change direction
                } else {
                    row--; // normal up-right move
                    col++;
                }
            }
            // moving down-left (↙)
            else {
                if (row == m - 1) { // if we are at last row
                    col++; // go right
                    dir = 1; // change direction
                } else if (col == 0) { // if we are at first column
                    row++; // go down
                    dir = 1; // change direction
                } else {
                    row++; // normal down-left move
                    col--;
                }
            }
        }
        return result;
    }
}