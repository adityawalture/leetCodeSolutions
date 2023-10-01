class Solution {
    public String reverseWords(String s) {
        char[] a = s.toCharArray();
        reverseWords(a);
        return new String(a);
        
        
    }
    void reverse(char[]a, int start, int end){
            while(start<end){
                char temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                end--;
                start++;
            }
        }
        
        void reverseWords(char[]a){
            int start = 0;
            int end = 0;
            int length = a.length;
            while(start<length){
                while(end<start || (end<length && a[end] != ' ')) end++;
                reverse(a, start, end-1);
                start = end+1;
            }
        }
}