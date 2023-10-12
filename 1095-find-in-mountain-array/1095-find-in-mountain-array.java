/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = getPeakElement(mountainArr);
        int length = mountainArr.length();
        if(mountainArr.get(peak) == target) return peak;
        int leftIndex = binarySearchAgnostic(target, mountainArr, 0, peak);
        if(leftIndex == -1){
            return binarySearchAgnostic(target, mountainArr, peak+1, length-1);
        }
        return leftIndex;
    }
    
    int getPeakElement(MountainArray mountainArr){
            int ans = -1;
            int len = mountainArr.length();
            int low = 0;
            int high = len-1;
            while(low <= high){
                int mid = low + (high-low)/2;
                if(mountainArr.get(mid) < mountainArr.get(mid+1)){
                    low = mid+1;
                }else{
                    ans = mid;
                    high = mid-1;
                }
            }
            return ans;
        }
        
        int binarySearchAgnostic(int target, MountainArray mountainArr, int start, int end){
            boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
            int low = start;
            int high = end;
            while(low <= high){
                int mid = low + (high-low)/2;
                if(mountainArr.get(mid) == target) return mid;
                if(isAsc){
                    if(target > mountainArr.get(mid)) low = mid +1;
                    else{
                        high = mid -1;
                    }
                }else{
                    if(target > mountainArr.get(mid)) high = mid-1;
                    else{
                        low = mid+1;
                    }
                }
            }
            
        return -1;
        }
}