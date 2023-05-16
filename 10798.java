import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] words = new char[5][15];
        
        for(int i = 0; i < words.length; i++){
            String str = br.readLine();
            for(int j = 0; j < str.length(); j++){
                words[i][j] = str.charAt(j);
            }
        }
        
        for(int i = 0; i < 15; i++) {
        	for(int j = 0; j < 5; j++) {
        		if(words[j][i] != '\0') {
        			System.out.print(words[j][i]);
        		}
        	}
        }
        br.close();
    }
}
