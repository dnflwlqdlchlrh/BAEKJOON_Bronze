import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class L4_23825 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		/*
		 *  N의 개수와 M의 개수가 2개씩 있어야지 모양을 만들 수 있기 때문에
		 *  어느 한 쪽이 숫자가 높더라도 모양을 만들 수 있는 개수는 정해져 있다.
		 *  그렇기 때문에 적은 개수에 맞추는 것이 맞기 때문에 최소값을 출력했다.
		 */
		System.out.println(Math.min(N / 2, M / 2));

	}

}
