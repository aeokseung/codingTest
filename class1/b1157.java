package class1;

import java.io.*;

public class b1157 {
	public static void main(String[] args) throws IOException {
		// 0. 입력 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine().toUpperCase();
		// 1. 알파벳별 counting
		int[] count = new int[26];
		int maxValue = 0;
		char maxChar = '?';
		// 
		for (int i = 0; i < str.length(); i++) {
			int idx = str.charAt(i) - 'A';
			++count[idx];
			if (maxValue < count[idx]) {
				// 2. 최댓값 업데이트
				maxValue = count[idx];
				maxChar = str.charAt(i);
			} else if (maxValue == count[idx])
				maxChar = '?';
		}
		// 출력
		bw.write(maxChar);
		// ?
		bw.close();
		br.close();
	}
}