package class1;

import java.io.*;
import java.util.*;

public class b2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a=Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int b=Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		if(a>b) {
			System.out.print(a);
		}else {
			System.out.print(b);
		}
	}
}
