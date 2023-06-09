import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder line = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) { // 사용할 수 있는 토큰이 더 있는지 확인
				StringBuilder sb = new StringBuilder(st.nextToken());
				line.append(sb.reverse() + " ");
			}
			line.append("\n");
		}
		
		System.out.print(line);
		br.close();
	}

}
