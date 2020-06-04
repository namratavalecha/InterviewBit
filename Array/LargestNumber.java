// Given a list of non negative integers, arrange them such that they form the largest number.

// For example:

// Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

// Note: The result may be very large, so you need to return a string instead of an integer.


import java.util.Collections;

public class LargestNumber implements Comparator<String> {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {
        ArrayList<String> temp = new ArrayList<String>();
        int n = A.size();
        int i;
        for(i = 0; i<n; i++){
            temp.add(String.valueOf(A.get(i)));
        }
        Collections.sort(temp, this);
        StringBuilder result = new StringBuilder();
        for(i = n-1; i>=0; i--){
            result.append(temp.get(i));
        }
        if(result.charAt(0) == '0'){
            return "0";
        }
        return result.toString();
    }
    
    @Override
    public int compare(String a, String b) {
        String num1 = a + b;
        String num2 = b + a;
        return (num1.compareTo(num2));
    }
}
