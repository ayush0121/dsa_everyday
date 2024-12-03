class Solution {
    static class Edge{
        int to;
        int weight;
        Edge(int to, int weight){
            this.to=to;
            this.weight=weight;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] time : times) {
            int u = time[0], v = time[1], w = time[2];
            graph.get(u).add(new Edge(v, w));
        }

        // Step 2: Initialize distance array and priority queue
        long[] dist = new long[n + 1];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[k] = 0; // Starting node distance is 0

        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[1]));
        pq.offer(new long[]{k, 0}); // {node, current_distance}

        // Step 3: Run Dijkstra's algorithm
        while (!pq.isEmpty()) {
            long[] current = pq.poll();
            int node = (int) current[0];
            long distance = current[1];

            if (distance > dist[node]) continue;

            for (Edge edge : graph.get(node)) {
                int nextNode = edge.to;
                long newDist = distance + edge.weight;

                if (newDist < dist[nextNode]) {
                    dist[nextNode] = newDist;
                    pq.offer(new long[]{nextNode, newDist});
                }
            }
        }

        // Step 4: Calculate the maximum distance and check for unreachable nodes
        long maxDist = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Long.MAX_VALUE) return -1; // Unreachable node
            maxDist = Math.max(maxDist, dist[i]);
        }

        return (int) maxDist;
        
    }
}