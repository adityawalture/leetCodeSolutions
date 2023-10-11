class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] start = new int[flowers.length];
    int[] end = new int[flowers.length];
    int i = 0;
    for(int[] flower : flowers){
        start[i] = flower[0];
        end[i++] = flower[1];
    }
    Arrays.sort(start);
    Arrays.sort(end);
    for(i = 0; i < people.length; i++){
        int x = bs(start, people[i]);
        int y = bs(end, people[i] - 1);
        people[i] = x - y;
    }
    return people;
    }
    
    private static int bs(int[] arr, int k){
    int l = 0, r = arr.length - 1, mid, i;
    while(l <= r){
        mid = (l + r) / 2;
        if(arr[mid] <= k && mid < arr.length - 1 && k < arr[mid + 1]){
            return mid + 1;
        }
        else if(arr[mid] > k) r = mid - 1;
        else l = mid + 1;
    }
    return l;
}
}