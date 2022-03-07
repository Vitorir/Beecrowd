import java.util.Scanner;

public class SeisNumerosImpares1070 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int X = s.nextInt();
		
		int i = 0;
		while (i < 6) { // enquanto o i for menor que 6, o X é checado se ele é impar, se for incrementa o contador, se não, passa reto;
						        // depois, sai da condição if e incrementa o X 1 por 1;
			if (X % 2 != 0) {
				System.out.println(X);
				i++; // só incrementa o contador se a condição for aceita!
			}
			X++; // o valor de X é incrementado ininterruptamente, mesmo se a condição for negada
		}
		
		
	}

}
