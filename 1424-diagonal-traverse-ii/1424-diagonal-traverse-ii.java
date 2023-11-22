class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int m = nums.size(), maxsum = 0, size = 0, index = 0;
        List<Integer>[] map = new ArrayList[100001];
        
        for(int i=0; i<m; i++){
            size+= nums.get(i).size();
            for(int j=0; j<nums.get(i).size(); j++){
                int sum = i+j;
                if(map[sum]==null) map[sum] = new ArrayList<>();
                map[sum].add(nums.get(i).get(j));
                maxsum = Math.max(maxsum, sum);
            }
        }
        
        int[] res = new int[size];
        for(int i=0; i<=maxsum; i++){
            List<Integer> curr = map[i];
            for(int j=curr.size()-1; j>=0; j--){
                res[index++] = curr.get(j);
            }
        }
        return res;
    }
}