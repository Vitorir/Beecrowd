// O maior

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int abs = s.nextInt();
		
		if (a > b && a > abs) {
			System.out.println(a + " eh o maior");
		} else if (b > abs) {
			System.out.println(b + " eh o maior");
		} else {
			System.out.println(abs + " eh o maior");
		}
    }
 
}
