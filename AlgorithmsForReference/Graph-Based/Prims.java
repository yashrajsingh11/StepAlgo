public class Prims {

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

    void primMST(int arr[][], int v, int s) {

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
            int in = minKey(key, visited, v);
            visited[in] = true;

            for(int j = 0; j < v; j++) {
                if(arr[in][j] != 0 && !visited[j] && arr[in][j] < key[j]) {
                    parent[j] = in;
                    key[j] = arr[in][j];
                }
            }

            dest[i] = in;
            src[i] = parent[in];            
        }

        for(int i = 1; i < v; i++) {
            System.out.println(src[i] + " , " + dest[i] + " W- " + arr[src[i]][dest[i]]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v = 9;
        int arr[][] = {{0, 4, 0, 0, 0, 0, 0, 8, 0},
                       {4, 0, 8, 0, 0, 0, 0, 11, 0},
                       {0, 8, 0, 7, 0, 4, 0, 0, 2},
                       {0, 0, 7, 0, 9, 14, 0, 0, 0},
                       {0, 0, 0, 9, 0, 10, 0, 0, 0},
                       {0, 0, 4, 14, 10, 0, 2, 0, 0},
                       {0, 0, 0, 0, 0, 2, 0, 1, 6},
                       {8, 11, 0, 0, 0, 0, 1, 0, 7},
                       {0, 0, 2, 0, 0, 0, 6, 7, 0}};
        
        Prims p = new Prims();
        p.primMST(arr, v, 0);
    }
}
