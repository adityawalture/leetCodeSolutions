class Solution {
    public int romanToInt(String s) {
       HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int totalValue = 0;
        int preValue = 0;
        int value = 0;
        
        for(int i = s.length()-1; i >=0; i--){
            value = map.get(s.charAt(i));
            if(value >= preValue){
                totalValue += value ;
            }else{
                totalValue -= value;
            }
            preValue = value;
        }
        return totalValue;
    }
}