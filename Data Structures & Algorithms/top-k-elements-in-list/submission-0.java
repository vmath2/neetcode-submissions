class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int[] result = new int[k];
        for(int i = 0; i< nums.length; i++) {
            int count = frequencyMap.getOrDefault(nums[i], 0);
            count++;
            frequencyMap.put(nums[i], count);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
        
        pq.addAll(frequencyMap.keySet());
        int m = 0;
        while(k > 0) {
            result[m++] = pq.poll();
            k--;
        }
        return result;
        }
}
