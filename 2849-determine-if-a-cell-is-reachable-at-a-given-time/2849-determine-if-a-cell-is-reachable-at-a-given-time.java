class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int dist = Math.max(Math.abs(fx-sx), Math.abs(fy-sy));
        
        if(dist == 0 && t == 1) return false;
        
        if(dist <= t){
            return true;
        }
        return false;
    }
}