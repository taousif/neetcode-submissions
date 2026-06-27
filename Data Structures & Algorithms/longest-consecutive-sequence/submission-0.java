class Solution {
    public int longestConsecutive(int[] nums) {
        //Set<Integer> numSet = new HashSet<>(Arrays.asList(nums));
        Set<Integer> numSet = Arrays.stream(nums)
                          .boxed()
                          .collect(Collectors.toSet());
        int maxLen=0;
        for(int i=0; i<nums.length; i++) {
            if(!numSet.contains(nums[i]-1)) {
                int len = 1 ;
                while(numSet.contains(nums[i] + len)){
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen; 
    }
}
