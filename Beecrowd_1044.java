// Multiplos

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int A, B, maior, menor;
		A = s.nextInt();
		B = s.nextInt();
		maior = 0;
		menor = 0;
		
		if (A > B) {
			maior = A;
			menor = B;
		} else {
			maior = B;
			menor = A;
		}
		
		if (maior % menor == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
    }
 
}
