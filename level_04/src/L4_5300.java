import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L4_5300 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			System.out.print(i + " ");
			
			if(i % 6 == 0) {
				System.out.print("Go! ");
			} else if(i == N) {
				System.out.print("Go! ");
			}
		}
	}
}
