class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0, maxStreak = 0;

        for(int num : nums){
            if(num == 1){
                 current++;

                 maxStreak = Math.max(maxStreak, current);
            } else {
                current = 0;
            }
        }

        return maxStreak;
    } 
}