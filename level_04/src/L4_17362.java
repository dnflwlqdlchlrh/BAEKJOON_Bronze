import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L4_17362 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		손을 보면 8번 움직인 후 다시 처음부터 반복되는 걸로 알 수 있습니다.

//		즉, 입력받은 수를 8로 나눈 나머지로 해도 똑같은 결과가 나온다는걸 알 수 있습니다.

//		1 ~ 5 중 수를 선택해서 출력해야 하므로

//		입력 받은 수를 8로 나눈 나머지가 0, 7, 6인 경우 1 ~ 5 중 1가지 수를 출력해주고 아닌 경우 해당 수를 출력해주면 됩니다.

//		0인경우 8번을 누르므로 위 사진을 보면 2을 선택하면 된다는걸 알 수 있습니다.

//		이와 같은 방법으로 7 -> 3, 6 -> 4를 해주면됩니다.
		
		int N = Integer.parseInt(br.readLine()) % 8;
		
		System.out.println(N == 0 ? 2 : N == 6 ? 4 : N == 7 ? 3 : N);
		
		
		
//		for문 사용한 코드
//		int N = Integer.parseInt(br.readLine());
//		int count = 1;
//		int change = -1;
//
//		for (int i = 1; i < N; i++) {
//			if (count <= 1) {
//				change *= -1;
//			}
//
//			count += change;
//
//			if (count >= 5) {
//				change *= -1;
//			}
//		}
//
//		System.out.println(count);
		
		

		

	}

}
