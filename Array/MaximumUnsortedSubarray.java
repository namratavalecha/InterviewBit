import java.util.*;

public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        ArrayList<Integer> sorted = new ArrayList<>(A);
        Collections.sort(sorted);
        int left = -1, right = -1;
        int n = A.size();
        for(int i = 0; i < n; i++){
            if(A.get(i) != sorted.get(i)){
                left = i;
                break;
            }
        }
        for(int i = n-1; i >= 0; i--){
            if(A.get(i) != sorted.get(i)){
                right = i;
                break;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        if(left == -1 && right == -1){
            result.add(-1);
        }
        else{
            result.add(left);
            result.add(right);
        }
        return result;
    }
}