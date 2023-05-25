import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int N = Integer.parseInt(br.readLine());
			if(N == -1) {
				break;
			}
			
			int sum = 0;
			for(int i = 1; i < N; i++) {
				if(N % i == 0) {
					sum += i;
					sb.append(i).append(" + ");
				}
			}
			
			if(N == sum) {
				sb.insert(0, N + " = ");
				sb.delete(sb.length() - 2, sb.length()); //시작 인덱스와 종료 인덱스를 인수로 사용
				System.out.println(sb.toString());
			}
			else { 
				System.out.println(N + " is NOT perfect.");
			}
			
			sb.setLength(0);
		}
	}
}
