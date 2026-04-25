import java.util.Arrays;

public class NetworkDelayTime {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        int[][] graph = {
                {2, 1, 1},
                {2, 3, 1},
                {3, 4, 1}
        };

        int[][] dist = new int[n+1][n+1];
        for(int[] row : dist)
            Arrays.fill(row, Integer.MAX_VALUE);

        for(int i = 0; i <= n; i++)
            dist[i][i] = 0;

        for(int[] edge : graph){
            dist[edge[0]][edge[1]] = edge[2];
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == j) continue;
                for (int via = 1; via <= n; via++) {
                    if(j == via) continue;
                    if(dist[i][via] == Integer.MAX_VALUE || dist[via][j] == Integer.MAX_VALUE) continue;
                    dist[i][j] = Math.min(dist[i][j], dist[i][via] + dist[via][j]);
                }
            }
        }

        int maxNum = 0;
        for(int i = 1; i <= n; i++) {
            if(dist[k][i] == Integer.MAX_VALUE) {
                System.out.println(-1);
                return;
            }
            maxNum = Math.max(maxNum, dist[k][i]);
        }

        System.out.println(maxNum);

    }
}
