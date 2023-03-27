import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L4_6887 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		double N1 = Math.sqrt(N);
		
		System.out.printf("The largest square "
				+ "has side length %.0f.", Math.floor(N / N1));

	}

}
