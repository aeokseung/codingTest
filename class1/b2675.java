package class1;

import java.io.*;
import java.util.*;

public class b2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String[] str = br.readLine().split(" ");
			int R = Integer.parseInt(str[0]);
			//getBytes를 써서 하나씩 val에 넣어준다(A 넣어주고 다음에 B, 다음에 C)
			for (byte val : str[1].getBytes()) {
				// R만큼 반복 후 sb.append를 사용해서 옆에 붙여준다
				//getBytes를 쓰면 ascii code값이 나오기 때문에 (char)을 써서 문자로 바꿔줌
				for (int j = 0; j < R; j++) {
					sb.append((char) val);
				}
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
}