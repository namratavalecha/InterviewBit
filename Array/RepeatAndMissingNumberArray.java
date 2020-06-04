// You are given a read only array of n integers from 1 to n.

// Each integer appears exactly once except A which appears twice and B which is missing.

// Return A and B.

// Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

// Note that in your output A should precede B.

// Example:

// Input:[3 1 2 5 3] 

// Output:[3, 4] 

// A = 3, B = 4


public class RepeatAndMissingNumberArray {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        long n = A.size();
        int a = 0, b = 0;
        long sum = 0;
        long sum_of_n = n*(n+1)/2;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++){
            if(set.contains(A.get(i))){
                a = A.get(i);
            }
            else{
                set.add(A.get(i));
            }
            sum += A.get(i);
        }
        b = (int)(sum_of_n - sum) + a;
        res.add(a);
        res.add(b);
        return res;
    }
}
