class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i<nums.length; i++){
            int value = target -nums[i];

            if(map.containsKey(value)) {
                int smallIndex = Math.min(i, map.get(value));
                int bigIndex = Math.max(i, map.get(value));
                result[0] = smallIndex;
                result[1] = bigIndex;
                return result;
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
