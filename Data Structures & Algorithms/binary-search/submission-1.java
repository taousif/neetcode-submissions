class Solution {
    
    public int search(int[] nums, int target) {
        return binSearch(nums, target, 0, nums.length-1);
        // return search_iter(nums, target);
    }

    int binSearch(int[] nums, int target, int l, int r) {
        if( l > r )
            return -1; 
        int mid = l + (r-l)/2;
        if(nums[mid] == target) {
            return mid;
        }
        
        if(nums[mid]< target){
            // l = mid;
            return binSearch(nums, target, mid+1, r);
        }
        else //if(nums[mid]> target){
            // r = mid;
            return binSearch(nums, target, l, mid-1);
        

    }

    int search_iter(int nums[], int target) {
        int l=0, r=nums.length-1;
        while(l <= r) {
            System.out.println("l :"+l +" , r: "+r);
            int m = l + (r-l)/2;
            if(nums[m] == target) 
                return m;
            if(nums[m] < target ) {
                l = m + 1; 
            }
            else {
                r = m - 1;
            }
        }

        return -1;
    }
}
