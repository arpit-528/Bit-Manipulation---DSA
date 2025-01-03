class Solution {
    public int missingNumber(int[] nums) {
        int xorAll = 0;
        int xorNums = 0;
        for(int i = 0; i<=nums.length; i++) {
            xorAll ^= i;
        }
        for(int i = 0; i<nums.length; i++) {
            xorNums ^= nums[i];
        }

        return xorAll ^ xorNums;
    }
}
