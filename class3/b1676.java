package class3;

import java.io.*;

public class b1676 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		// 팩토리얼의 규칙, 5!은 0이 1개, 10!은 0이 2개, ...
		int count = n / 5;
		System.out.println(count);
	}
}