class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        int maxLen = 1;
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            if(!set.contains(num))
                set.add(num);
        }

        for(int num: nums){
            int count = 1;
            if(set.contains(num - 1))
                continue;
            while(set.contains(++num)){
                count++;
            }

            if(count > maxLen)
                maxLen = count;
        } 

        return maxLen;       


        
    }
}
