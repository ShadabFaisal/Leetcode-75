import java.util.ArrayList;
import java.util.List;

public class Leetcode_841KeysAndRooms {

	public static void main(String[] args) {
		List<List<Integer>> rooms =new ArrayList<>();
		
		for(int i=0;i<4;i++) {
			rooms.add(new ArrayList<>());
		}
		rooms.get(0).add(1);
		rooms.get(1).add(2);
		rooms.get(2).add(3);
		System.out.println(canVisitAllRooms(rooms));
	}
	
	static boolean[] visited;
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited=new boolean[rooms.size()];
        visited[0]=true;
        dfs(rooms,0);
        for(boolean b:visited){
            if(!b){
                return false;
            }
        }
        return true;   
    }
    public static void dfs(List<List<Integer>> rooms, int room){
        for(int i:rooms.get(room)){
            if(!visited[i]){
                visited[i]=true;
                dfs(rooms,i);
            }
        }
    }

}
