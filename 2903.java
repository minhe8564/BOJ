import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 1~15
		int[] total = new int[16];
		int width = 2; 
		
		for(int i = 0; i < total.length; i++) {
			total[i] = width*width;
			width = width + (width-1);
		}
		
		System.out.print(total[N]);
		br.close();
	}
}
