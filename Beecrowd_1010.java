// Calculo Simples

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
		
	    	// Entrada
		int codigo1, numero1, codigo2, numero2; // Declaração de variáveis
		double valor1, valor2; 
	    	// Instanciação 1
		codigo1 = s.nextInt();
		numero1 = s.nextInt();
		valor1 = s.nextDouble();
	    
	    	// Processamento
		double total1 = numero1 * valor1;
		
	    	// Instanciação 2
		codigo2 = s.nextInt();
		numero2 = s.nextInt();
		valor2 = s.nextDouble();
	    	
	    	// Processamento 2
		double total2 = numero2 * valor2;
		double total = total1 + total2;
	    
	    	// Saída
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }
 
}
