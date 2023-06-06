import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			Stack<String> stack = new Stack<>();
			boolean isVPS = true;
			
			for(int j = 0; j < s.length(); j++) {
				String c = String.valueOf(s.charAt(j));
				if(c.equals("(")) {
					stack.push(c);
				}
				else if(c.equals(")")) {
					if(!stack.empty()) { // stack에 값이 있으면 "(" 스택 값 제거
						stack.pop();
					}
					else { // stack에 "(" 가 없는데 ") 나왔으면 false
						isVPS = false;
						break;
					}
				}
			}
			
			if(!stack.empty()) {
				isVPS = false;
			}
			
			if(isVPS) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
		br.close();
	}

}
