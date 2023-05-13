import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int X = Integer.parseInt(arr[1]);
        
        String[] numsArr = br.readLine().split(" ");
        int[] nums = new int[N];
        for(int i = 0; i < N; i++){
            nums[i] = Integer.parseInt(numsArr[i]);
            if(X > nums[i]){
                System.out.print(nums[i] + " ");
            }
        }
        
        br.close();
    }
}
