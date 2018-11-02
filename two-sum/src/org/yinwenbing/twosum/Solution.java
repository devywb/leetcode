package org.yinwenbing.twosum;

/**
 * @author yinwb
 * @create 2018-11-02 16:46
 **/
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length ==0 ) return null;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j ++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 2, 7};
        int target = 9;
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        System.out.println(result);
    }
}
