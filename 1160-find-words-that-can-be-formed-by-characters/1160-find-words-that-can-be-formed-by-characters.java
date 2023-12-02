class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        for(int i=0; i<chars.length(); i++){
            count[chars.charAt(i)-'a']++;
        }
        int ans = 0;
        for(String s:words){
            if(charFound(s,count)){
                ans+=s.length();
            }
        }
        return ans;
    }
    boolean charFound(String word, int[] count){
        int[] c = new int[26];
        for(int i=0; i<word.length(); i++){
            int x = word.charAt(i)-'a';
            c[x]++;
            if(c[x]>count[x]) return false;
        }
        return true;
    }
}