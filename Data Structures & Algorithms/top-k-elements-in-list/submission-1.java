class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // 1. Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Get all unique elements
        List<Integer> elements = new ArrayList<>(map.keySet());

        // 3. Sort elements by decreasing frequency
        elements.sort((a, b) -> map.get(b) - map.get(a));

        // 4. Take the first k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = elements.get(i);
        }

        return result;
    }
}