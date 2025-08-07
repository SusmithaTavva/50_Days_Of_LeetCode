class Solution {
  public int totalFruit(int[] tree) {
    int ans = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int l = 0, r = 0; r < tree.length; ++r) {
      map.put(tree[r], map.getOrDefault(tree[r], 0) + 1);
      while (map.size() > 2) {
        map.put(tree[l], map.get(tree[l]) - 1);
        map.remove(tree[l], 0);
        ++l;
      }
      ans = Math.max(ans, r - l + 1);
    }
    return ans;
  }
}