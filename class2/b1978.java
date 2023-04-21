package class2;

import java.io.*;
import java.util.*;

public class b1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()) {
			// 소수인경우 true, 아닌경우 false
			boolean isPrime = true;
			int num = Integer.parseInt(st.nextToken());
			if (num == 1) {
				continue;
			}
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
			}
		}
		System.out.println(count);
	}
}