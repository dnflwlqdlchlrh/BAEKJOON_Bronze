import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L4_17356 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		double result = 1 / (1 + Math.pow(10, (B - A) / 400.0));
		
		System.out.println(result);
		
	}

}
