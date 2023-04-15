import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class L4_16727 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Persepolis = 0;
		int Esteghlal = 0;

		for(int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			if(i == 0) {
				Persepolis += Integer.parseInt(st.nextToken());
				Esteghlal += Integer.parseInt(st.nextToken());
			} else {
				Esteghlal += Integer.parseInt(st.nextToken());
				Persepolis += Integer.parseInt(st.nextToken());
			}
			
		}
			
	}

}
