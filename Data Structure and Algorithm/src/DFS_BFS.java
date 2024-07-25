import java.util.ArrayList;
import java.util.List;

public class DFS_BFS{
    private List<List<Integer>> adj;
    private boolean [] visited;
    //entering function
    public DFS_BFS(int nodes){
        adj = new ArrayList<>();
        visited = new boolean[nodes];
        for (int i = 0; i < nodes; i++){
            adj.add(new ArrayList<>());
        }
    }
    // additional function
    public void addEdge(int u, int v){
        adj.get(u).add(v);
    }
    public void dfs(int node){
        System.out.println(node);
        visited[node] = true;
        for (int u: adj.get(node)){
            if(!visited[u]){
                dfs(u);
            }
        }
    }
    public static void main(String[] args){
        DFS_BFS dfs= new DFS_BFS(5);
        dfs.addEdge(0, 1);
        dfs.addEdge(0,2);
        dfs.addEdge(1,3);
        dfs.addEdge(2,4);
        System.out.println("Depth-First Search traversal: ");
        dfs.dfs(0);
    }
}