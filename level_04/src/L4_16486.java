
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L4_16486 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());

        System.out.println((d1 + d2 * 3.141592) * 2);
        
    }
}
