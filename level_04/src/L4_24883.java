import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L4_24883 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		
		if(N.equals("N") || N.equals("n")) {
			System.out.println("Naver D2");
		} else {
			System.out.println("Naver Whale");
		}
		
	}

}
