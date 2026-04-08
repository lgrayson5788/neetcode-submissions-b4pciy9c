class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;

        while(digits[i] == 9){
            if(i != 0){
                digits[i] = 0;
                i--;

            }
            else{
                int[] newArray = new int[digits.length + 1];
                for(int j = 0; j < newArray.length; j++){
                    if(i == 0)
                        newArray[i] = 1;
                    else
                    newArray[i] = 0;
                }
                return newArray;
            }
        }

        digits[i]++;

        return digits;
    }
}
