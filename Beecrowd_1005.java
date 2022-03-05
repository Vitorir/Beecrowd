// 1005 - Média 1

import java.io.IOException; // Comando requerido no Beecrowd
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
		
    		// Entrada
		double A = s.nextDouble();
		double B = s.nextDouble();
		
		// Processamento (Cálculo de Média Ponderada)
		double soma = 3.5 * A + 7.5 * B; // Nota A vezes o peso de A + Nota B vezes peso da nota B
		double MEDIA = soma / 11; // Divide o valor real pelo peso total 11

		// Saída
		System.out.printf("MEDIA = %.5f\n", MEDIA);

	}
}
