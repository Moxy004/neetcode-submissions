class Solution {
    public void moveZeroes(int[] nums) {
        int last = 0;

        for(int slow = 0; slow < nums.length; slow++){
            if(nums[slow] != 0){
                int temp = nums[last];
                nums[last] = nums[slow];
                nums[slow] = temp;
                last++;
            }
        }
    }
}