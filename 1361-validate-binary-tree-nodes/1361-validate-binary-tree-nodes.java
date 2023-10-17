class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        HashMap<Integer, ArrayList<Integer>> parentToChild = new HashMap<>();
        HashMap<Integer, Integer> childToParent = new HashMap<>();
        
        for(int node=0; node<n; node++){
            int left = leftChild[node];
            if(left != -1){
                parentToChild.putIfAbsent(node, new ArrayList<>());
                parentToChild.get(node).add(left);
                if(childToParent.containsKey(left)){
                    return false;
                }else{
                    childToParent.put(left,node);
                }
            }
            
            
            int rigth = rightChild[node];
            int right = rightChild[node];
            if(rigth != -1){
                parentToChild.putIfAbsent(node, new ArrayList<>());
                parentToChild.get(node).add(right);
                if(childToParent.containsKey(right)){
                    return false;
                }else{
                    childToParent.put(right, node);
                }
            }
        }
        
        //Root node
        Integer root = null;
        for(int node=0; node<n; node++){
            if(!childToParent.containsKey(node)){
                if(root == null){
                    root = node;
                }else{
                    return false;
                }
            }
        }
        if(root == null){
            return false;
        }
        
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> que = new LinkedList<>();
        
        que.add(root);
        
        while(!que.isEmpty()){
            int node = que.remove();
            visited.add(node);
            
            if(parentToChild.containsKey(node)){
                for(int child : parentToChild.get(node)){
                    que.add(child);
                }
            }
        }
        
        return visited.size() == n;
    }
}