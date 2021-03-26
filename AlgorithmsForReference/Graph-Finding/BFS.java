import java.util.LinkedList;

public class BFS {

    int[] queue = new int[100];
    int front = -1, rear = -1;

    public static void addEdge(LinkedList<Integer> adjList[],int x,int y) {
        adjList[x].add(y);

    }

    void enqueue(int item) {

        if(front == -1)
            front = front + 1;
        rear = rear + 1;
        queue[rear] = item;

    }



    void dequeue() {
        front = front + 1;
    }

    boolean QueueEmpty() {
        if(front > rear)
            return true;
        return false;
    }

    void BFS(LinkedList<Integer> adjList[],int v,int s){
        int[] visited = new int[v];
        for(int i=0; i<v; i++){
            visited[i] = -1;
        }

        visited[s] = 0;

        enqueue(s);

        while (!QueueEmpty()){
            s = queue[front];
            System.out.print(s + " ");
            /*for(int i=0; i<v; i++){
                if(visited[i]==0){
                    System.out.print("Current - "+ i+" ");
                }
                else if(visited[i] == 1){
                    System.out.print("Visited - "+ i+" ");
                }
                else{
                    System.out.print("Not visited yet - "+ i +" ");
                }
            }*/
            dequeue();
            visited[s] = 1;
            for (int i=0;i<adjList[s].size(); i++){
                int x = adjList[s].get(i);
                //System.out.println(x);
                if(visited[x] != 1){
                    visited[x] = 0;
                    enqueue(x);
                }
            }
        }

    }

    public static void main(String[] srgs) {
        int v = 4;
        int e = 6;
        LinkedList<Integer> adjList[] = new LinkedList[20];
        int[][] edges = {{0,1},{0,2},{1,2},{2,0},{2,3},{3,3}};

        for(int i = 0; i<6; i++) {
            adjList[i] = new LinkedList<Integer>();
        }

        for(int i = 0; i<6; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            addEdge(adjList,x,y);
        }
        BFS bf = new BFS();
        bf.BFS(adjList,v,2);
    }
}
