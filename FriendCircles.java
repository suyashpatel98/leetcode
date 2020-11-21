class Solution {
    
    private void dfs(int[][] g, boolean[] v, int start){
        v[start] = true;
        for(int i = 0; i < g[start].length; i++){
            if(!v[i] && g[start][i] == 1){
                dfs(g, v, i);
            }
        }
    }
    
    public int findCircleNum(int[][] M) {
        boolean[] v = new boolean[M.length];
        int count = 0;
        for(int i = 0; i < v.length; i++){
            if(!v[i]){
                count++;
                dfs(M, v, i);
            }
        }
        return count;
    }
}
