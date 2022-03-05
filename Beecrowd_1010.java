// Calculo Simples

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
		
		int codigo1, numero1, codigo2, numero2;
		double valor1, valor2; 
		codigo1 = s.nextInt();
		numero1 = s.nextInt();
		valor1 = s.nextDouble();
		double total1 = numero1 * valor1;
		
		codigo2 = s.nextInt();
		numero2 = s.nextInt();
		valor2 = s.nextDouble();
		double total2 = numero2 * valor2;
		double total = total1 + total2;
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }
 
}
