class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '#' && !s1.isEmpty()){
                s1.pop();
            }else if(ch != '#'){
                s1.push(ch);
            }
        }
        for(int j=0; j<t.length(); j++){
            char ch = t.charAt(j);
            if(ch == '#' && !s2.isEmpty()){
                s2.pop();
            }else if(ch != '#'){
                s2.push(ch);
        }
    }
    
      return s1.equals(s2);   
    }
}