import java.util.ArrayList;
import java.util.List;

public class Leetcode_547NumberOfProvinces {

	public static void main(String[] args) {
		int[][] isConnected = {{1,0,0},{0,1,0},{0,0,1}};
		System.out.println(findCircleNum(isConnected));

	}
	
	public static int findCircleNum(int[][] isConnected) {

        int V=isConnected.length;
        List<List<Integer>> adjList=new ArrayList<>();

        for(int i=0;i<V;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }

        boolean[] visited=new boolean[V];
        int c=0;
        for(int i=0;i<V;i++){
            if(!visited[i]){
                c++;
                dfs(i,adjList,visited);
            }
        }
        return c;
    }

    private static void dfs(int i,List<List<Integer>> adjList, boolean[] visited){
        visited[i]=true;
        for(int it:adjList.get(i)){
            if(!visited[it]){
                dfs(it,adjList,visited);
            }
        }

    }

}
