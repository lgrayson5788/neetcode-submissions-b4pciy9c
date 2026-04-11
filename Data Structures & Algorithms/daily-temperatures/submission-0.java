class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int[] result = new int[temps.length];

        int daysNum = 0;

        for(int i = 0; i < temps.length; i++){
            int count = 1;
            result[i] = 0;
            for(int j = i + 1; j < temps.length; j++){
                if(temps[j] > temps[i]){
                    result[i] = count;
                    break;
                }
                count++;
            }
        }

        return result;
    }
}
