package class1;

import java.io.*;
import java.util.*;

public class b2577 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		//()안의 객체를 지정한 객체로 변환시킴(ex. String.valueOf(10)→ ‘10’)
		String str = String.valueOf(val);
		 
		for (int i = 0; i < str.length(); i++) {
			arr[(str.charAt(i) - 48)]++;
		}
 
		for (int v : arr) {
			System.out.println(v);
		}
	}
}
