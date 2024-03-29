class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[] result = new Integer[rowIndex + 1];
        result[0] = 1;
        for(int i=1; i<=rowIndex; i++){
            result[i] = (int) (((long)result[i-1] * (rowIndex - i + 1)) / i);
        }
        return Arrays.asList(result);
    }
}