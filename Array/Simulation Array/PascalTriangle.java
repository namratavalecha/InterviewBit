// Given numRows, generate the first numRows of Pascal’s triangle.

// Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

// Example:

// Given numRows = 5,

// Return

// [
//      [1],
//      [1,1],
//      [1,2,1],
//      [1,3,3,1],
//      [1,4,6,4,1]
// ]


public class PascalTriangle {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>(A);
        for(int i = 0; i < A; i++){
            result.add(new ArrayList<Integer>(Collections.nCopies(i+1, 1)));
        }
        for (int i = 2; i < A; i++){
            int limit = result.get(i).size();
            for(int j = 1; j < limit - 1; j++){
                result.get(i).set(j, result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
        }
        return result;
    }
}
