import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // N개 줄
		int M = Integer.parseInt(st.nextToken()); // M개 정수로 땅의 높이
		int B = Integer.parseInt(st.nextToken()); // 인벤토리에 존재하는 블록
		
		int leastTime = Integer.MAX_VALUE;
		int finalHeight = 0;
		int[][] block = new int[N][M];
		for(int i = 0;  i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				block[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int h = 0; h <= 256; h++) { // 모든 땅의 높이 고려
			int build = 0; // 블록 놓음, 1초
			int remove = 0; // 블록 제거 2초
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					int height = block[i][j] - h;
					if(height > 0) { remove += height; }
					else if(height < 0) { build -= height; }
				}
			}
			
			if(remove + B >= build) {
				int time = remove*2 + build;
				if(leastTime >= time) {
					leastTime = time;
					finalHeight = h;
				}
			}
		}
		
		System.out.print(leastTime + " " + finalHeight);
		br.close();
	}

}
