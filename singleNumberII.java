class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int k = 0; k <= 31; k++) {
            int count = 0;
            for(int i = 0; i < nums.length; i++) {
                if((nums[i] & (1 << k)) != 0) {
                    count++;
                }
            }
                if(count % 3 == 1) {
                    result = result | (1 << k);
            }
        }
        return result; 
    }
}