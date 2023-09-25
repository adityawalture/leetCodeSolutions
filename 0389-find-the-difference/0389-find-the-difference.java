class Solution {
    public char findTheDifference(String s, String t) {
        int result = 0;
        
        for(int i=0; i< t.length(); i++){
            result = result + t.charAt(i);
        }
        for(int i=0; i< s.length(); i++){
            result = result - s.charAt(i);
        }
        
        return (char)result;
    }
}