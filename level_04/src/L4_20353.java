import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L4_20353 {
	
	private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());
        System.out.println(4*Math.sqrt(a));
    }

    public static void main(String[] args) throws IOException {
        new L4_20353().solution();
    }

//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		long a = Long.parseLong(br.readLine());
//		System.out.println(4 * Math.sqrt(a));
//
//	}

}