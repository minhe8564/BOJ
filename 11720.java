import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); 

        String numbers = sc.nextLine();
        int total = 0;
        
        for(int i = 0; i < N; i++) {
            int num = numbers.charAt(i) - '0';
            total += num;
        }
        
        System.out.print(total);
        sc.close();
    }
}
