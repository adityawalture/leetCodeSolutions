class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int n=nums1.length,m=nums2.length;
      int res[]=new int[n+m];
      int i=0,j=0,k=0;
      while(i<n && j<m){
          if(nums1[i]<nums2[j]){
              res[k++]=nums1[i++];
          }else res[k++]=nums2[j++];
      }
      while(i<n){
          res[k++]=nums1[i++];
      }
      while(j<m){
          res[k++]=nums2[j++];
      }
      int size=n+m;
      if(size%2==0){
          int l=(size-1)/2;
          int r=size/2;
          return (res[l]+res[r])/2.0;
      }  
      return res[size/2]/1.0;
    }
}