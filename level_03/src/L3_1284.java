import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L3_1284 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
			int sum = 0;
			String num = br.readLine();
			if(num.charAt(0) == '0') {
				break;
			}
			
			for(int i = 0; i < num.length(); i++) {
				sum++;
				if(num.charAt(i) == '1') {
					sum += 2;
				} else if(num.charAt(i) == '0') {
					sum += 4;
				} else {
					sum += 3;
				}
				
				if(i + 1 == num.length()) {
					sum++;
				}
			}
			System.out.println(sum);
		}
	}
}
