class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String, PriorityQueue<String>> hash = new HashMap<>();
        for(int i=0; i<tickets.size(); i++){
            String key = tickets.get(i).get(0);
            String value = tickets.get(i).get(1);
            
            if(!hash.containsKey(key)){
                PriorityQueue<String> temp = new PriorityQueue<>();
                hash.put(key, temp);
            }
            
            hash.get(key).add(value);
        }
        
        LinkedList<String> res = new LinkedList<>();
        dfs("JFK", hash, res);
        return res;
    }
    
    public void dfs(String dep, Map<String, PriorityQueue<String>> hash, LinkedList<String> res){
        PriorityQueue<String> arrivals = hash.get(dep);
        while(arrivals != null && !arrivals.isEmpty()){
            dfs(arrivals.poll(), hash, res);
        }
        
        res.addFirst(dep);
    }
}