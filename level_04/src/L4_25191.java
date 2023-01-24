import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class L4_25191 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken()) / 2;
		int B = Integer.parseInt(st.nextToken()) / 1;
		
		System.out.println(Math.min(N, A + B));
		
		
		
		// TODO Auto-generated method stub

	}

}
