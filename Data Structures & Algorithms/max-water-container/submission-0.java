class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxWater = 0;
        
        // Two pointer approach
        while (left < right) {
            // Calculate current area: width * min height
            int width = right - left;
            int minHeight = Math.min(heights[left], heights[right]);
            int currentArea = width * minHeight;
            
            // Update maximum area found so far
            maxWater = Math.max(maxWater, currentArea);
            
            // Move the pointer with the smaller height inward
            if (heights[left] < heights[right]) {
                left++;  // Move left pointer right
            } else {
                right--; // Move right pointer left
            }
        }
        
        return maxWater;
    }
}
