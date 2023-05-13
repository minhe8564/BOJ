import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String[] numsArr = br.readLine().split(" ");
        int[] nums = new int[N];
        int v = Integer.parseInt(br.readLine());
        int count = 0;
        
        for(int i = 0; i < N; i++){
            nums[i] = Integer.parseInt(numsArr[i]);
        }
        for(int i = 0; i < N; i++){
            if(v == nums[i]){
                count++;
            }
        }
        
        System.out.print(count);
    }
}
