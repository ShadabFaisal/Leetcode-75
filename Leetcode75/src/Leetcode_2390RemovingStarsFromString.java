import java.util.Stack;

public class Leetcode_2390RemovingStarsFromString {

	public static void main(String[] args) {
		String s = "leet**cod*e";
		System.out.println(removeStars(s));
	}
	
	public static String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch != '*'){
                st.push(ch);
                continue;
            }
            else{
                st.pop();
            }
        }
        if(st.isEmpty())return "";

        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }

}
