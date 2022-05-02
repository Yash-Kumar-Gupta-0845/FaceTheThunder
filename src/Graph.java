public class Graph {
    static int [][] adj;
    public Graph (int n) {
        this.adj = new int[n][n];
    }
    public void add(int u,int v){
        this.adj[u][v]=1;
        this.adj[v][u]=1;
    }

    public static void main(String[] args) {
        Graph g=new Graph(4);
        g.add(0,1);
        g.add(1,2);
        g.add(2,3);
        g.add(3,0);
        System.out.println(adj[1][1]);
    }
}
