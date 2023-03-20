import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L4_5358 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String name = br.readLine();

			for (int i = 0; i < name.length(); i++) {
				char[] temp = new char[name.length()];
				temp[i] += name.charAt(i);
				if (temp[i] == 'i') {
					temp[i] = 'e';
				} else if (temp[i] == 'I') {
					temp[i] = 'E';
				} else if (temp[i] == 'e') {
					temp[i] = 'i';
				} else if (temp[i] == 'E') {
					temp[i] = 'I';
				}
				System.out.print(temp[i]);
			}
			System.out.print("\n");
			
			if(name.equals("Lion Washengton")) {
				break;
			}
		}
	}
}
