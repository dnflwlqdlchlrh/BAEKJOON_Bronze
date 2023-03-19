import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L4_5357 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		String result = "";
		for (int i = 0; i < N; i++) {
			String sam = br.readLine();
			result = "";
			result += sam.charAt(0);
			int idx = 0;
			for (int j = 0; j < sam.length(); j++) {
				if (result.charAt(idx) != sam.charAt(j)) {
					result += sam.charAt(j);
					idx++;
				}
			}
			System.out.println(result);
		}
	}
}
