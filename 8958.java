import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String test[] = new String[N];
        for(int i = 0; i < N; i++) {
        	test[i] = br.readLine();
        }
        
        for(int i = 0; i < N; i++){
            int score = 0;
            int total = 0;
            for(int j = 0; j < test[i].length(); j++){
                if(test[i].charAt(j) == 'O'){
                    score++;
                    total += score;
                }
                else{
                    score = 0;
                }
            }
            System.out.println(total);
        }
    }
}
