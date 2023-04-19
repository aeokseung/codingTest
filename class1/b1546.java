package class1;

import java.io.*;
import java.util.*;

public class b1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		double sum = 0;

		for (int i = 0; i < n; i++) {
			// nextToken을 쓰면 알아서 다음 값들을 비교해준다
			int num = Integer.parseInt(st.nextToken());
			System.out.print(num);
			// 시험 점수 최댓값 구하기
			m = Math.max(m, num);
			// 시험 점수 합에 더해주기
			sum += num;
		}
		// 40 / 80 * 100 + 80 / 80 * 100 + 60 / 80 * 100
		// =(40 + 80 + 60) / 80 * 100
		sum /= (double) m;
		sum *= 100.0;
		// 평균 구하기
		sum /= (double) n;
		System.out.print(sum);
	}
}
