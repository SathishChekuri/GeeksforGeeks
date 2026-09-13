import java.util.*;

class Solution {
    public int partyHouse(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();

        int a = bfs(0, adj)[0];
        int diameter = bfs(a, adj)[1];

        return (diameter + 1) / 2;
    }

    int[] bfs(int src, ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        int[] dist = new int[n];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        dist[src] = 0;

        int farthest = src;

        while (!q.isEmpty()) {
            int u = q.poll();

            if (dist[u] > dist[farthest])
                farthest = u;

            for (int v : adj.get(u)) {
                v--;

                if (dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    q.add(v);
                }
            }
        }

        return new int[]{farthest, dist[farthest]};
    }
}