public class Kruskal {

    void swap(int[]arr, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int partition(int x[], int y[], int w[], int low, int high) {
        int pivot = w[high];
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(w[j] <= pivot) {
                i = i + 1;
                swap(w, i, j);
                swap(x, i, j);
                swap(y, i, j);
            }
        }

        swap(w, i + 1, high);
        swap(x, i + 1, high);
        swap(y, i + 1, high);
        return i + 1;
    }

    void quickSort(int x[], int y[], int w[], int low, int high) {
        if(low < high) {
            int pi = partition(x, y, w, low, high);
            quickSort(x, y, w, low, pi - 1);
            quickSort(x, y, w, pi + 1, high);
        }
    }

    int find(int parent[], int i) {

        if(parent[i] == -1)
            return i;

        return find(parent, parent[i]);

    }

    void union_set(int parent[], int x, int y) {

        int x_set = find(parent, x);
        int y_set = find(parent, y);
        if(x_set != y_set)
            parent[x_set] = y_set;

    }

    boolean isCyclic(int edge[][], int v, int e) {

        int parent[] = new int[v];
        for(int i = 0; i < v; i++) {
            parent[i] = -1;
        }

        for(int i = 0; i < e; i++) {
            int x = find(parent,edge[i][0]);
            int y = find(parent,edge[i][1]);
            if(x == y)
                return true;
            union_set(parent, x, y);
        }
        return false;
    }

    void kruskalMST(int x[], int y[], int w[], int e, int v) {

        int edge[][] = new int[100][100];
        int visited[] = new int[v];
        int k = 0;

        for(int i = 0; i < v; i++){
            visited[i] = 0;
        }

        int i = 0;
        while(i < 14) {
            edge[k][0] = x[i];
            edge[k][1] = y[i];
            edge[k][2] = w[i];
            if(!isCyclic(edge, v, k + 1)){
                System.out.println("Edge-> " + x[i] + " <--> " + y[i] + " " + " W-> " + w[i]);
                k = k + 1;
            }
            i = i + 1;
        }
    }

    public static void main(String[] rgs) {
        int v = 9;
        int e = 14;
        int x[] = new int[e];
        int y[] = new int[e];
        int w[] = new int[e];
        int[][] edges =  {{0,1,4}, {0,7,8}, {1,7,11}, {1,2,8}, {2,3,7}, {3,4,9}, {2,8,2}, {2,5,4}, {3,5,14}, {4,5,10}, {6,8,6}, {6,7,1}, {7,8,7}, {5,6,2}};
        
        for (int i = 0; i < e; i++) {
            x[i] = edges[i][0];
            y[i] = edges[i][1];
            w[i] = edges[i][2];
        }

        Kruskal kr = new Kruskal();
        kr.quickSort(x, y, w, 0, e - 1);
        kr.kruskalMST(x, y, w, e, v);
    }
}
