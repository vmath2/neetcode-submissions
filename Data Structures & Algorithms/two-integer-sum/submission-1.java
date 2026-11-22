class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (set.containsKey(complement)) {
                int complementIndex = set.get(complement);
                if (complementIndex < i) {
                    result[0] = complementIndex;
                    result[1] = i;
                    return result;
                } else {
                    result[0] = i;
                    result[1] = complementIndex;
                    return result;
                }

            } 
            set.put(nums[i], i);
        }
        return result;
        
    }
}
