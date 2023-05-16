import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] nums = new int[9][9];
        int maxNum = 0;
        int N = 0, M = 0;

        for(int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                nums[i][j] = Integer.parseInt(st.nextToken());
                if(maxNum < nums[i][j]){
                    maxNum = nums[i][j];
                    N = i;
                    M = j;
                }
            }
        }
        System.out.println(maxNum);
        System.out.print((N+1) + " " + (M+1));
        br.close();
    }
}
