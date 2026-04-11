class Solution {
    public boolean isHappy(int n) {
        if(n == 1)
            return true;
        
        Set<Integer> prevNum = new HashSet<Integer>();
        prevNum.add(n);

        while(true){
            int newNum = 0;
            while(n != 0){
                newNum += (n % 10) * (n % 10);
                n /= 10;
            }
            n = newNum;

            if(n == 1){
                return true;
            }
            if(prevNum.contains(n))
                return false;
            prevNum.add(n);
        }
    }
}
