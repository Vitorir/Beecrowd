// 1002 - Área do Círculo

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
     	Scanner s = new Scanner(System.in);
		
		double R = s.nextDouble();
		double n = 3.14159;
		double A = (n * (R * R));

		System.out.printf("A=%.4f\n", A);

    }
 
}
