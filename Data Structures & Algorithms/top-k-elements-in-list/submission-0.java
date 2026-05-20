class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<List<Integer>> count = new ArrayList<>(nums.length);
        for(int i=0 ; i<=nums.length; i++){
            count.add(null);
        }

        for(int i: nums) {
            freq.put(i, freq.getOrDefault(i,0)+1);
        }

        for(int i: freq.keySet()) {
            int f = freq.get(i);
            if(count.get(f) == null) {
                count.set(f, new ArrayList<>());
            }
            count.get(f).add(i);
        }

        int[] res= new int[k]; 
        int j=0; 
        for (int i=count.size() -1; i>=0; i--) {
             if (count.get(i) != null) {
                for (int n : count.get(i)) {
                    res[j++] = n;
                    if (j == k) {
                        return res;
                    }
                }
            }
        }

       return res;
    }
}
