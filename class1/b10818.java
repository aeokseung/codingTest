package class1;

import java.util.*;
import java.io.*;

public class b10818 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//첫 줄의 정수의 개수 n은 필요 없으므로 저장 안 하고 읽어버리기
		Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int max = -1000001;
		int min = 1000001;
		//StringTokenizer에 사용할 수 있는 토큰이 더 있는지 확인, 
		//이 메서드가 true를 반환하는 경우는 토큰이 존재하고, false를 반환하는 경우 토큰이 없다
		while (st.hasMoreTokens()) {
			//공백으로 두 번째 줄을 나눠서 숫자 1개씩 val에 넣는다
			int val = Integer.parseInt(st.nextToken());
			//val이 max보다 크면 max에 val값을 넣어준다
			//더 큰 val값이 나오기 전까지 max값 유지
			if (val > max) {
				max = val;
			}
			//val이 min보다 작으면 min에 val값을 넣어준다
			//더 작은 val값이 나오기 전까지 min값 유지
			if (val < min) {
				min = val;
			}
		}
		System.out.print(min + " " + max);
	}
}
