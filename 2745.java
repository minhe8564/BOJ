import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        
        //B진법 수 N을 10진법으로 출력
        int tmp = 1;
        int ans = 0;
        for(int i = N.length() - 1; i >= 0; i--){
            char c = N.charAt(i);
            
            if('A' <= c && c <= 'Z'){
                ans += (c - 'A' + 10) * tmp;
            } else {
                ans += (c - '0') * tmp;
            }
            tmp *= B;
            
        }
        System.out.print(ans);
    }
}
