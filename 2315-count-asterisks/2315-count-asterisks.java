class Solution {
    public int countAsterisks(String s) {
        int c=0,count=0;
       char ch[]=new char[s.length()];
       for(int i=0;i<s.length();i++){
           ch[i]=s.charAt(i);
           if(ch[i]=='|')
           count++;
           if((ch[i]==42||ch[i]=='*')&&(count%2==0))
           c++;
       }
       return c;
    }
}