class Graph {
    private int adj[][];
    private int n;
    private final int MAX = (int) (1e9);
    
    public Graph(int n, int[][] edges) {
        this.n = n;
        this.adj = new int[n][n];

        for (int row[] : adj) {
            Arrays.fill(row, MAX);
        }

        for (int i = 0; i < n; i++) {
            adj[i][i] = 0;
        }

        for (int edge[]: edges) {
            int source = edge[0];
            int dest = edge[1];
            int weight = edge[2];

            adj[source][dest] = weight;
        }

        for (int via = 0; via < n; via++) {
            for (int source = 0; source < n; source++) {
                for (int dest = 0; dest < n; dest++) {
                    adj[source][dest] = Math.min(
                        adj[source][dest],
                        adj[source][via] + adj[via][dest]
                    );
                }
            }
        }
    }
    
    public void addEdge(int[] edge) {
        int viaStart = edge[0];
        int viaEnd = edge[1];
        int viaCost = edge[2];

        for (int source = 0; source < n; source++) {
            for (int dest = 0; dest < n; dest++) {
                adj[source][dest] = Math.min(
                    adj[source][dest], 
                    adj[source][viaStart] + viaCost + adj[viaEnd][dest]
                );
            }
        }
    }
    
    public int shortestPath(int node1, int node2) {
        int dist = adj[node1][node2];

        return dist == MAX ? -1 : dist;
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */