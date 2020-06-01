// Given an integer array, find if an integer p exists in the array such that the number of integers greater than 
// p in the array equals to p

// If such an integer is found return 1 else return -1.


import java.util.Collections;

public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size();
        for(int i = 0; i < n; i++){
            if(i < n-1 && A.get(i) == A.get(i+1)){
                continue;
            }
            
            if(n - i - 1 == A.get(i)){
                return 1;
            }
        }
        return -1;
    }
}
