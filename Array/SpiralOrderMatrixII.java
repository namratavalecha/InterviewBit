// Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.


// Input Format:

// The first and the only argument contains an integer, A.
// Output Format:

// Return a 2-d matrix of size A x A satisfying the spiral order.
// Constraints:

// 1 <= A <= 1000
// Examples:

// Input 1:
//     A = 3

// Output 1:
//     [   [ 1, 2, 3 ],
//         [ 8, 9, 4 ],
//         [ 7, 6, 5 ]   ]

// Input 2:
//     4

// Output 2:
//     [   [1, 2, 3, 4],
//         [12, 13, 14, 5],
//         [11, 16, 15, 6],
//         [10, 9, 8, 7]   ]


public class SpiralOrderMatrixII {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int top = 0, left = 0;
        int bottom = A-1, right = A-1;
        int dir = 0;
        int temp = 1;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>(A);
        for(int i=0; i < A; i++) {
            result.add(new ArrayList<Integer>(Collections.nCopies(A, 0)));
        }
        while(top <= bottom && left <= right && temp <= A*A){
            if(dir == 0){
                for(int i = left; i <= right; i++){
                    result.get(top).set(i, temp);
                    temp++;
                }
                top++;
                dir = 1;
            }
            if(dir == 1){
                for(int i = top; i <= bottom; i++){
                    result.get(i).set(right, temp);
                    temp++;
                }
                right--;
                dir = 2;
            }
            if(dir == 2){
                for(int i = right; i >= left; i--){
                    result.get(bottom).set(i, temp);
                    temp++;
                }
                bottom--;
                dir = 3;
            }
            if(dir == 3){
                for(int i = bottom; i >= top; i--){
                    result.get(i).set(left, temp);
                    temp++;
                }
                left++;
                dir = 0;
            }
        }
        return result;
    }
}