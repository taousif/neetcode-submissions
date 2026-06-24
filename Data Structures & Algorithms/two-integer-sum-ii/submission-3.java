class Solution {
    public int[] twoSum2(int[] numbers, int target) {
        int[] result = new int[2];
        int i=0;
        int j=numbers.length -1;
        while(i<j) {
            if(numbers[i] + numbers[j] == target) {
                result[0] = i+1;
                result[1] = j+1; 
                return result;
            }
            else if(numbers[i] + numbers[j] < target) {
                i++;
            }
            else if(numbers[i] + numbers[j] > target) {
                j--;
            }
             
        }
        return result;
    }

    public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;
    while (left < right) {
        int sum = numbers[left] + numbers[right];
        if (sum == target) {
            return new int[]{left + 1, right + 1};
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }
    return new int[]{-1, -1}; // should never be reached
}
}
