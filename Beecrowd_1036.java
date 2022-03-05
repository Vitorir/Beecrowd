// Fórmula de Bhaskara

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		double A, B, C;
		A = s.nextDouble();
		B = s.nextDouble();
		C = s.nextDouble();
		double delta = (B*B - 4 * A * C);
		double R1 = (-B + Math.sqrt(delta)) / (2 * A);
		double R2 = (-B - Math.sqrt(delta)) / (2 * A);
		
		if (A == 0 || delta < 0) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.print("R1 = ");
			System.out.printf("%.5f\n", R1);
			System.out.print("R2 = ");
			System.out.printf("%.5f\n", R2);
		}
    }
 
}
