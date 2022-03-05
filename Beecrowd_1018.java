// Cédulas

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int notas100 = 0;
		int notas50 = 0;
		int notas20 = 0;
		int notas10 = 0;
		int notas5 = 0;
		int notas2 = 0;
		int notas1 = 0;
		System.out.println(N);
		
		for (int i = 0; i < N; i++) {
			if (N >= 100) {
				notas100 = N / 100;
				N = N % 100; // 5
			}
			
			if (N >= 50) { // 1
				notas50 = N / 50;
				N = N % 50;
			}
			if (N >= 20) { // 1
				notas20 = N / 20;
				N = N % 20;
			}
			if (N >= 10) { // 0
				notas10 = N /10;
				N = N % 10;
			}
			if (N >= 5) { // 1
				notas5 = N / 5;
				N = N % 5;
			}
			if (N >= 2){ // 0
				notas2 = N / 2;
				N = N % 2;
			}
			if (N >= 1) { 
				notas1 = N;
			}
		}
		System.out.println(notas100 + " nota(s) de R$ 100,00");
		System.out.println(notas50 + " nota(s) de R$ 50,00");
		System.out.println(notas20 + " nota(s) de R$ 20,00");
		System.out.println(notas10 + " nota(s) de R$ 10,00");
		System.out.println(notas5 + " nota(s) de R$ 5,00");
		System.out.println(notas2 + " nota(s) de R$ 2,00");
		System.out.println(notas1 + " nota(s) de R$ 1,00");
    }
 
}
