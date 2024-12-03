class Solution {
static class Edge {
        int to;
        double probability;
        Edge(int to, double probability) {
            this.to = to;
            this.probability = probability;
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double prob = succProb[i];
            graph.get(u).add(new Edge(v, prob));
            graph.get(v).add(new Edge(u, prob));
        }

        // Step 2: Initialize probability array and priority queue
        double[] maxProb = new double[n];
        maxProb[start_node] = 1.0;

        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[1], a[1]));
        pq.offer(new double[]{start_node, 1.0}); // {node, probability}

        // Step 3: Run modified Dijkstra's algorithm
        while (!pq.isEmpty()) {
            double[] current = pq.poll();
            int node = (int) current[0];
            double prob = current[1];

            // Explore neighbors
            for (Edge edge : graph.get(node)) {
                int nextNode = edge.to;
                double newProb = prob * edge.probability;

                // Update the probability if we find a higher one
                if (newProb > maxProb[nextNode]) {
                    maxProb[nextNode] = newProb;
                    pq.offer(new double[]{nextNode, newProb});
                }
            }
        }

        // Step 4: Check if the end node is reachable
        return maxProb[end_node] == 0.0 ? 0.0 : maxProb[end_node];
    
        
    }
}