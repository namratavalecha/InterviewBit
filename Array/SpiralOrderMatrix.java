// Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.

// Example:

// Given the following matrix:

// [
//     [ 1, 2, 3 ],
//     [ 4, 5, 6 ],
//     [ 7, 8, 9 ]
// ]
// You should return

// [1, 2, 3, 6, 9, 8, 7, 4, 5]

public class SpiralOrderMatrix{
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[] arr = new int[row*col];
        int top = 0, bottom = row - 1;
        int left = 0, right = col - 1;
        int dir = 0;
        int count = 0;
        while(top <= bottom && left <= right){
            if(dir == 0){
                for(int i = left; i <= right; i++){
                    arr[count++] = A[top][i];
                }
                top++;
                dir = 1;
            }
            else if(dir == 1){
                for(int i = top; i <= bottom; i++){
                    arr[count++] = A[i][right];
                }
                right--;
                dir = 2;
            }
            else if(dir == 2){
                for(int i = right; i >= left; i--){
                    arr[count++] = A[bottom][i];
                }
                bottom--;
                dir = 3;
            }
            else if(dir == 3){
                for(int i = bottom; i >= top; i--){
                    arr[count++] = A[i][left];
                }
                left++;
                dir = 0;
            }
        }
        return arr;
    }
}
