class Solution {

    public long minCost(int[] basket1, int[] basket2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int m = Integer.MAX_VALUE;
        for (int i : basket1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            m = Math.min(m, i);
        }
        for (int i : basket2) {
            map.put(i, map.getOrDefault(i, 0) - 1);
            m = Math.min(m, i);
        }

        List<Integer> arr = new ArrayList<>();
        for (var j : map.entrySet()) {
            int count = j.getValue();
            if (count % 2 != 0) return -1;
            for (int i = 0; i < Math.abs(count) / 2; i++) {
                arr.add(j.getKey());
            }
        }

        Collections.sort(arr);
        long ans = 0;
        for (int i = 0; i < arr.size() / 2; i++) {
            ans += Math.min(2 * m, arr.get(i));
        }
        return ans;
    }
}