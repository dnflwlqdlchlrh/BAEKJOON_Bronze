import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//import java.util.Scanner;
//
//class Test {
//	
//	public void Method() {
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			double X = sc.nextDouble();
//			double Y = sc.nextDouble();
//			
//			if(X > 0 && Y > 0) {
//				System.out.println("Q1");
//			} else if(X < 0 && Y < 0) {
//				System.out.println("Q3");
//			} else if(X < 0 && Y > 0) {
//				System.out.println("Q2");
//			} else if(X > 0 && Y < 0) {
//				System.out.println("Q4");
//			} else if(X == 0 && Y == 0){
//				System.out.println("AXIS");
//				break;
//			} else {
//				System.out.println("AXIS");
//				
//			}
//		}
//	}
//}

public class L4_9772 {
	public static void main(String[] args) throws IOException{
		
//		Test test = new Test();
//		test.Method();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			double X = Double.parseDouble(st.nextToken());
			double Y = Double.parseDouble(st.nextToken());
			
			if(X > 0 && Y > 0) {
				System.out.println("Q1");
			} else if(X < 0 && Y < 0) {
				System.out.println("Q3");
			} else if(X < 0 && Y > 0) {
				System.out.println("Q2");
			} else if(X > 0 && Y < 0) {
				System.out.println("Q4");
			} else if(X == 0 && Y == 0){
				System.out.println("AXIS");
				break;
			} else {
				System.out.println("AXIS");
				
			}
		}
	}
}
