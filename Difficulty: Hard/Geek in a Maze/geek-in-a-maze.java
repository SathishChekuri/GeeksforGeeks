class Solution {

    public int numberOfCells(int r, int c, int u, int d, char[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        if (mat[r][c] == '#')
            return 0;

        int INF = Integer.MAX_VALUE;

        int[][] dist = new int[n][m];

        for (int i = 0; i < n; i++)
            java.util.Arrays.fill(dist[i], INF);

        java.util.ArrayDeque<Node> q = new java.util.ArrayDeque<>();

        dist[r][c] = 0;
        q.addFirst(new Node(r, c, 0));

        int count = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {

            Node cur = q.pollFirst();

            int cr = cur.r;
            int cc = cur.c;
            int up = cur.up;

            if (up != dist[cr][cc])
                continue;

            // Calculate downward moves used
            int down = up + (cr - r);

            // Check limits
            if (up > u || down > d)
                continue;

            count++;

            for (int i = 0; i < 4; i++) {

                int nr = cr + dr[i];
                int nc = cc + dc[i];

                if (nr < 0 || nr >= n ||
                    nc < 0 || nc >= m ||
                    mat[nr][nc] == '#')
                    continue;

                int newUp = up;

                // Moving UP
                if (nr == cr - 1)
                    newUp++;

                if (newUp >= dist[nr][nc])
                    continue;

                dist[nr][nc] = newUp;

                // Cost 0 → front
                if (nr != cr - 1) {
                    q.addFirst(new Node(nr, nc, newUp));
                }
                // Cost 1 → back
                else {
                    q.addLast(new Node(nr, nc, newUp));
                }
            }
        }

        return count;
    }
}

class Node {
    int r;
    int c;
    int up;

    Node(int r, int c, int up) {
        this.r = r;
        this.c = c;
        this.up = up;
    }
}