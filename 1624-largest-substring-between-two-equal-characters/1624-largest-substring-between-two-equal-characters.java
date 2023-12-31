class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int result = -1;
        for(int i=0; i<26; i++){
            int start = s.indexOf((i + 'a' ));
            int last = s.lastIndexOf((i + 'a' ));
            if(start > -1 && last > start) {
                result = Math.max(result, last-start-1);
            }
        }
        return result;
    }
}