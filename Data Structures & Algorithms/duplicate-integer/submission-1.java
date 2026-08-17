class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int e : nums){
            if ( seen.contains(e)){
                return true;
            }
            seen.add(e);
        }
        return false;
        
    }
}