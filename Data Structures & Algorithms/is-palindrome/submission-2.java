class Solution {
    public boolean isPalindrome(String s) {
        int left , right;
        StringBuilder newStr = new StringBuilder(s);

        for(int i = 0; i < newStr.length(); i++){
            if(!Character.isLetterOrDigit(newStr.charAt(i))){
                newStr.deleteCharAt(i);
                i--;
            }
        }


        

        String cleaned = newStr.toString().toLowerCase();

        System.out.println(cleaned);

        left = 0;
        right = cleaned.length() - 1;

        while(left < right){
            if(cleaned.charAt(left) != cleaned.charAt(right))
                return false;
            left++;
            right--;
    
        }

        return true;
        
    }
}
