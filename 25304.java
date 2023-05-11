import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int total = 0;
        
        for(int i = 0; i < N; i++){
            String[] s = br.readLine().split(" ");
            
            int a = Integer.parseInt(s[0]); //price
            int b = Integer.parseInt(s[1]); //count
            int amount = a * b;
            total += amount;
        }
            
        if(X == total){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        
        br.close();
    }
}
