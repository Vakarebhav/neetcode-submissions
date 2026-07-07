class Solution {
    public int majorityElement(int[] nums) {

        int majority = 0;

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // Must be inside the outer loop
            if (count > nums.length / 2) {
                majority = nums[i];
                break;
            }
        }

        return majority;
    }
}