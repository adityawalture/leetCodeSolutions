class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        double[]timeToReach=new double[n];
        for(int i=0; i<n; i++){
            timeToReach[i]=(double)dist[i]/speed[i];
        }
        Arrays.sort(timeToReach);
        for(int i=0; i<n; i++){
            if(timeToReach[i]<=i){
                return i;
            }
        }
        return n;
    }
}