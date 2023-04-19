package class2;

import java.io.*;
import java.util.*;

public class b1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long x = Long.parseLong(st.nextToken());
		long y = Long.parseLong(st.nextToken());
		long w = Long.parseLong(st.nextToken());
		long h = Long.parseLong(st.nextToken());
		long a = Math.min(x, w - x);
		long b = Math.min(y, h - y);
		System.out.print(Math.min(a,b));
	}
}