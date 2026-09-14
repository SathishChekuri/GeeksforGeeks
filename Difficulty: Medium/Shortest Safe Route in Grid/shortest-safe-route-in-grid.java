class Solution {

    int shortestPath(int[][] mat) {
               int n = mat.length;
               int m = mat[0].length;

               int[][] dist = new int[n][m];
               for (int[] row : dist)
                   Arrays.fill(row, -1);

               int[] dr = {-1, 1, 0, 0};
               int[] dc = {0, 0, -1, 1};

               boolean[][] unsafe = new boolean[n][m];

               for (int i = 0; i < n; i++) {
                   for (int j = 0; j < m; j++) {
                       if (mat[i][j] == 0) {
                           unsafe[i][j] = true;

                           for (int d = 0; d < 4; d++) {
                               int r = i + dr[d];
                               int c = j + dc[d];

                               if (r >= 0 && r < n && c >= 0 && c < m)
                                   unsafe[r][c] = true;
                           }
                       }
                   }
               }

               Queue<int[]> q = new LinkedList<>();

               for (int i = 0; i < n; i++) {
                   if (!unsafe[i][0]) {
                       q.add(new int[]{i, 0});
                       dist[i][0] = 1;
                   }
               }

               while (!q.isEmpty()) {
                   int[] cur = q.poll();
                   int r = cur[0];
                   int c = cur[1];

                   if (c == m - 1)
                       return dist[r][c];

                   for (int d = 0; d < 4; d++) {
                       int nr = r + dr[d];
                       int nc = c + dc[d];

                       if (nr >= 0 && nr < n && nc >= 0 && nc < m &&
                           !unsafe[nr][nc] && dist[nr][nc] == -1) {

                           dist[nr][nc] = dist[r][c] + 1;
                           q.add(new int[]{nr, nc});
                       }
                   }
               }

               return -1;
           }
       }
