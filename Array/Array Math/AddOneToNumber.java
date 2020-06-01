// Given a non-negative number represented as an array of digits,

// add 1 to the number ( increment the number represented by the digits ).

// The digits are stored such that the most significant digit is at the head of the list.

// Example:

// If the vector has [1, 2, 3]

// the returned vector should be [1, 2, 4]

// as 123 + 1 = 124.



public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int i = 0, reminder = 0;
        while(i < A.size()-1 && A.get(i)==0){
            A.remove(i);
        }
        for(i = A.size() - 1; i >= 0; i--){
            int num = A.get(i);
            if (num==9){
                A.set(i, 0);
                reminder = 1;
            }
            else{
                A.set(i, num+1);
                reminder = 0;
                break;
            }
        }
        if(reminder == 1){
            A.add(0, 1);
        }
        return A;
    }
}
