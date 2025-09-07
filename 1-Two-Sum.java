class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int k = j - i;
                if (nums[j] + nums[k] == target) {
                    return new int[] { k, j };
                }
            }
        }
        return null;
    }
}