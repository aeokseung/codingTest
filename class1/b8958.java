package class1;

import java.io.*;

public class b8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testCase = Integer.parseInt(br.readLine());
		String arr[] = new String[testCase];
		// arr[]배열에 OX퀴즈를 전부 넣는다
		for (int i = 0; i < testCase; i++) {
			arr[i] = br.readLine();
		}
		for (int i = 0; i < testCase; i++) {
			int cnt = 0;
			int sum = 0;
			// arr[0].length()=10
			for (int j = 0; j < arr[i].length(); j++) {
				// arr[0]의 배열에서 O또는 X를 한 개씩 O와 같은지 비교, 같으면 cnt값 1 증가
				// 이 부분 질문하기
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;// sum = sum+cnt
			}
			sb.append(sum).append('\n');
		}
		System.out.print(sb);
	}
}
