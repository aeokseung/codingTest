package class1;

import java.io.*;
import java.util.*;

public class b3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// HashSet 특징- 중복원소를 허용하지 않는다, 순서 개념이 없다
		HashSet<Integer> h = new HashSet<Integer>();
		// 주어진 숫자의 개수가 10개
		for (int i = 0; i < 10; i++) {
			//한 줄씩 읽고 정수로 바꾼 뒤 42로 나눈 나머지를 배열에 추가
			h.add(Integer.parseInt(br.readLine()) % 42);
		}
		//배열의 크기 출력
		System.out.print(h.size());
	}
}
