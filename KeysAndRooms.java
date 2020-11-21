class Solution {
    
    private void dfs(List<List<Integer>> rooms, boolean[] v,int start){
        v[start] = true;
        for(Integer i : rooms.get(start)){
            if(!v[i]){
                dfs(rooms, v, i);
            }
        }
    }
    
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] v = new boolean[rooms.size()];
        dfs(rooms, v, 0);
        for(int i = 0; i < v.length; i++){
            if(!v[i]){
                return false;
            }
        }
        return true;
    }
}
