// Given an index k, return the kth row of the Pascal’s triangle.

// Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

// Example:

// Input : k = 3

// Return : [1,3,3,1]

// NOTE : k is 0 based. k = 0, corresponds to the row [1]. 



public class KthRowofPascalTriangle {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> result = new ArrayList<>();
        int elem = 0;
        for(int i = 0 ; i<=A; i++){
            if(i==0 || i == A){
                result.add(i, 1);
            }
            else{
                elem = (result.get(i-1) * (A - i + 1))/i;
                result.add(i, elem);
            }
        }
        return result;
    }
}
