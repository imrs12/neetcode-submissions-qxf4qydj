class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       
       for( int num: nums){
            set.add(num);
       }
       
    int setsize = set.size();
    int numslength = nums.length;

    return setsize < numslength;
    }
}