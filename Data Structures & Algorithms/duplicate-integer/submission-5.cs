public class Solution {
    public bool hasDuplicate(int[] nums) {
        Array.Sort(nums);
        for (int i = nums.Length - 1; i>0; i--) {
            int j = i-1;
            if(nums[i] == nums[j]) {
                return true;
            }
        }
        return false;
    }
}