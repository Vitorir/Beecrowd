// Aumento de Salário

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		double salario = s.nextDouble();
		double reajuste = 0;
		int percentual = 0;
		
		if (salario >= 0 && salario <= 400.00) {
			percentual = 15;
			reajuste = (salario * percentual) / 100;
			salario = salario + reajuste;
		} else if (salario >= 400.01 && salario <= 800.00) {
			percentual = 12;
			reajuste = (salario * percentual) / 100;
			salario = salario + reajuste;
		} else if (salario >= 800.01 && salario <= 1200.00) {
			percentual = 10;
			reajuste = (salario * percentual) / 100;
			salario = salario + reajuste;
		} else if (salario >= 1200.01 && salario <= 2000.00) {
			percentual = 7;
			reajuste = (salario * percentual) / 100;
			salario = salario + reajuste;
		} else if (salario > 2000.00) {
			percentual = 4;
			reajuste = (salario * percentual) / 100;
			salario = salario + reajuste;
		}
		
		System.out.printf("Novo salario: %.2f\n", salario);
		System.out.printf("Reajuste ganho: %.2f\n", reajuste);
		System.out.println("Em percentual: " + percentual + " %");
    }
 
}
