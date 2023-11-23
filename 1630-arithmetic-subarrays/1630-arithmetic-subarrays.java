class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> answer = new ArrayList<>();
        for(int i=0; i<l.length; i++){
            int index = 0;
            int[] temp = new int[r[i]-l[i]+1];
            for(int j=l[i]; j<=r[i]; j++){
                temp[index++] = nums[j];
            }
            answer.add(toFindArithmetic(temp));
        }
        
        return answer;
    }
    
    public boolean toFindArithmetic(int[] temp){
        if(temp.length <= 2) return true;
        Arrays.sort(temp);
        int diff = temp[1] - temp[0];
        for(int i=1; i<temp.length; i++){
            if(temp[i]-temp[i-1] != diff) return false;
        }
        return true;
    }
}