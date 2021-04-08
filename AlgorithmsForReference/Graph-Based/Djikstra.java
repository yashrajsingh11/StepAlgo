public class Djikstra {

    int minKey(int key[], boolean visited[], int v) {
        int min = 1000000000;
        int index = 0;
        for(int i = 0; i < v; i++) {
            if(!visited[i] && key[i] < min) {
                min = key[i];
                index = i;
            }
        }
        return index;
    }

    void djikstra(int arr[][], int v, int s) {
        int parent[] = new int[v];
        int key[] = new int[v];
        boolean visited[] = new boolean[v];
        int[] src = new int[v];
        int[] dest = new int[v];

        for(int i = 0; i < v; i++) {
            key[i] = 1000000;
            visited[i] = false;
            parent[i] = -1;
        }
        key[s] = 0;

        for(int i = 0; i < v; i++) {
            int in = minKey(key,visited,v);
            visited[in] = true;
            for(int j = 0; j < v; j++) {
                if(arr[in][j] != 0 && !visited[j] && key[in] != 1000000 && arr[in][j] + key[in] < key[j]) {
                    parent[j] = in;
                    key[j] = key[in] + arr[in][j];
                }
            }
            dest[i] = in;
            src[i] = parent[in];
        }

        int dist = 0;
        for(int i = 1; i < v; i++) {
            System.out.println(src[i] + "," + dest[i] + " W- " + key[dest[i]]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int e = 10;
        int v = 5;
        int arr[][] = {{0, 10, 5, 0, 0},
                       {0, 0, 2, 1, 0},
                       {0, 3, 0, 9, 2},
                       {0, 0, 0, 0, 4},
                       {7, 0, 0, 6, 0}};
        Djikstra d = new Djikstra();
        d.djikstra(arr, v, 0);

    }
}
