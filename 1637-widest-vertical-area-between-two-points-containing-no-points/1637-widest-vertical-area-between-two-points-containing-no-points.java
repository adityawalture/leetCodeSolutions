class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        
        int[] y = new int[points.length];
        for (int i = 0; i < points.length; i++) y[i] = points[i][0];
        Arrays.sort(y);
        int z = 0;
        for (int i = 1; i< y.length; i++) z = Math.max(y[i] - y[i-1], z);
        return z;
    }
}