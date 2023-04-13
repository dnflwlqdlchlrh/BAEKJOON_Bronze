import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L4_10480 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num % 2 == 0) {
				System.out.printf("%d is even\n", num);
			} else {
				System.out.printf("%d is odd\n", num);
			} 
		}
	}
}
