import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double total = 0;
		double scoreSum = 0;
		double gradeScore[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
		String gradeList[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
		
		for(int i = 0; i < 20; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String subject = st.nextToken(); // 과목명
			double score = Double.parseDouble(st.nextToken()); // 학점
			String grade = st.nextToken(); // 등급

			for(int j = 0; j < 10; j++) {
				if(grade.equals(gradeList[j])) {
					total += score * gradeScore[j];
					if(j != 9) {
						scoreSum += score;
					}
				}
			}
		}
		
		double avg = total / scoreSum;
		System.out.printf("%.6f", avg);
		
		br.close();
	}
}
