class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for(int x = 0; x < nums.length; x++){
            ans[x] = nums[x];
            ans[x + nums.length] = nums[x];
        }

        return ans;
    }
}