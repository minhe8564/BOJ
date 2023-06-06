import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] basket = new int[N];
		int num = 1;
		for (int arr = 0; arr < N; arr++) {
			basket[arr] = num;
			num++;
		}
		
		for(int order = 0; order < M; order++) { 
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()) - 1; // 배열 인덱스 0부터 시작하기 때문에 -1 해줘야함.
			int j = Integer.parseInt(st.nextToken()) - 1;
			 
			// basket[i] 부터 basket[j] 까지 reverse
			while(i < j) {
				int temp = basket[i];
				basket[i++] = basket[j];
				basket[j--] = temp;
			}
		}
		
		for(int k = 0; k < N; k++) { 
			System.out.print(basket[k] + " "); 
		}

		br.close();
	}

}
