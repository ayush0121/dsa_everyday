class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> result = new ArrayList<>();
    int[] NoOfIncomingEdges = new int[n];
    for(List<Integer> i: edges){
        NoOfIncomingEdges[i.get(1)]+=1;
        
    }
    for(int i=0;i<n;i++){
        if(NoOfIncomingEdges[i]==0){
            result.add(i);
        }
    }
    return result;
        
    }
}