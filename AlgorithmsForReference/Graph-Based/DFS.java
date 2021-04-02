import java.util.LinkedList;

public class DFS {

    public static void addEdge(LinkedList<Integer> adjList[],int x,int y) {
        adjList[x].add(y);
    }

    void DFSutil(LinkedList<Integer> adjList[],int v, int visited[],int completelyVisited[]){
        visited[v] = 1;
        System.out.println(v + " ");
        /*for (int i=0; i<10; i++){
            System.out.print(completelyVisited[i]+" ");
        }*/
        if(adjList[v] == null){
            return;
        }
        for (int i=0; i<adjList[v].size(); i++){
            if(i+1 == adjList[v].size()){
                completelyVisited[v] = 1;
            }
            int x = adjList[v].get(i);
            if(visited[x]==0){
                DFSutil(adjList,x,visited,completelyVisited);
            }
        }
    }

    void DFS(LinkedList<Integer> adjList[],int v,int s){
        int[] visited = new int[v];
        int[] completelyVisited = new int[v];

        for (int i=0; i<v; i++){
            visited[i] = 0;
            completelyVisited[i] = 0;
        }
        DFSutil(adjList,s,visited,completelyVisited);
        for (int i=0; i<v; i++){

            if(visited[i]==0){
                completelyVisited[i] = 1;
                //System.out.print(i+" ");
                DFSutil(adjList,i,visited,completelyVisited);
            }
        }
    }

    public static void main(String[] srgs) {
        int v = 10;
        int e = 10;
        LinkedList<Integer> adjList[] = new LinkedList[20];
        int[][] edges = {{0,1},{0,2},{1,3},{1,4},{3,5},{4,5},{2,6},{2,7},{2,8},{2,9}};

        for(int i = 0; i<6; i++) {
            adjList[i] = new LinkedList<Integer>();
        }

        for(int i = 0; i<6; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            addEdge(adjList,x,y);
        }
        DFS d = new DFS();
        d.DFS(adjList,v,0);

    }
}

