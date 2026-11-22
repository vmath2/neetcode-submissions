class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while(low <= high) {
            int currentSum = numbers[low] + numbers[high];
            if (currentSum > target) {
                high --;
            } else if( currentSum < target) {
                low++;
            } else {
                int[] result = new int[2];
                result[0] = low +1;
                result[1] = high +1;
                return result;
            }
        }
        return new int[0];
    }
}
