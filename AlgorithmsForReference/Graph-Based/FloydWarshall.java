public class BellmanFord {

    void bellmanFord(int arr[][], int v, int s) {
        int key[] = new int[v];
        for(int i = 0; i < v; i++) {
            key[i] = 100000;
        }
        key[s] = 0;
        
        for(int k = 0; k < v - 1; k++) {
            for(int i = 0; i < v; i++) {
                for(int j = 0; j < v; j++) {
                    if(arr[i][j] != 0 && key[i] != 100000 && arr[i][j] + key[i] < key[j]) {
                        key[j] = arr[i][j] + key[i];
                    }
                }
                for (int l = 0; l < v; l++) {
                    System.out.print(key[l] + " ");
                }
                System.out.println();
            }
        }

        for(int i = 0; i < v; i++) {
            System.out.println(s + " - " + i + " - " + key[i] );
        }
    }

    public static void main(String[] args) {
        int v = 5;
        int arr[][] = {{0, 6, 7, 0, 0},
            		   {0, 0, 8, 5, -4},
            		   {0, 0, 0, -3, 9},
            		   {0, -2, 0, 0, 0},
            		   {2, 0, 0, 7, 0}};
        BellmanFord bf = new BellmanFord();
        bf.bellmanFord(arr, v, 0);
    }
}
