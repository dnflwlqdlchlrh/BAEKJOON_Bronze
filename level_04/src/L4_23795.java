import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L4_23795 {

	public static void main(String[] args)  throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long sum = 0;
		
		while(true) {
			
			long N = Long.parseLong(br.readLine());
			
			if(N == -1) {
				break;
			}
			sum += N;
		}
		
		System.out.println(sum);

	}

}
