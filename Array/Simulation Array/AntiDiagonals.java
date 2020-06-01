// Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.

// Example:

        
// Input:  

// 1 2 3
// 4 5 6
// 7 8 9

// Return the following :

// [ 
//   [1],
//   [2, 4],
//   [3, 5, 7],
//   [6, 8],
//   [9]
// ]


// Input : 
// 1 2
// 3 4

// Return the following  : 

// [
//   [1],
//   [2, 3],
//   [4]
// ]


public class AntiDiagonals {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int top = 0, bottom = A.size();
        int left = 0, right = A.get(0).size();
        ArrayList<Integer> temp;
        for(int i = left; i < right; i++){
            temp = new ArrayList<Integer>();
            top = 0;
            left = i;
            while(left >= 0 && top < A.size()){
                temp.add(A.get(top++).get(left--));
            }
            result.add(temp);
        }
        top = 1;
        for(int i = top; i < bottom; i++){
            temp = new ArrayList<Integer>();
            top = i;
            right = A.get(0).size() - 1;
            while(top < A.size() && right > 0){
                temp.add(A.get(top++).get(right--));
            }
            result.add(temp);
        }
        return result;
    }
}
