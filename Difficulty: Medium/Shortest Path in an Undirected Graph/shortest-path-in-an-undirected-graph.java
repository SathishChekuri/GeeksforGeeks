class Solution {
    public ArrayList<Integer> shortestPath(int V, int[][] edges, int src, int dest) {

        int INF = (int)1e9;

        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();

        for(int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        for(int[] e : edges) {
            graph.get(e[0]).add(new Pair(e[1], e[2]));
            graph.get(e[1]).add(new Pair(e[0], e[2]));
        }

        // Dijkstra from destination
        int[] dist = new int[V + 1];

        Arrays.fill(dist, INF);

        PriorityQueue<Pair> pq =
            new PriorityQueue<>((a, b) -> Integer.compare(a.wt, b.wt));

        dist[dest] = 0;
        pq.add(new Pair(dest, 0));

        while(!pq.isEmpty()) {

            Pair curr = pq.poll();

            int node = curr.node;
            int wt = curr.wt;

            if(wt != dist[node])
                continue;

            for(Pair next : graph.get(node)) {

                int newDist = wt + next.wt;

                if(newDist < dist[next.node]) {

                    dist[next.node] = newDist;

                    pq.add(new Pair(next.node, newDist));
                }
            }
        }

        // No path
        if(dist[src] == INF) {
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(-1);
            return ans;
        }

        // Construct lexicographically smallest shortest path
        ArrayList<Integer> ans = new ArrayList<>();

        int curr = src;
        ans.add(curr);

        while(curr != dest) {

            int nextNode = -1;
            int best = Integer.MAX_VALUE;

            for(Pair next : graph.get(curr)) {

                // This edge can be part of a shortest path
                if(dist[curr] == next.wt + dist[next.node]) {

                    if(next.node < best) {
                        best = next.node;
                        nextNode = next.node;
                    }
                }
            }

            curr = nextNode;
            ans.add(curr);
        }

        return ans;
    }
}

class Pair {
    int node;
    int wt;

    Pair(int node, int wt) {
        this.node = node;
        this.wt = wt;
    }
}