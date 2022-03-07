import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < N; i++) { // vai ler N vezes o X
			int X = s.nextInt();
			
			if (X >= 10 && X <= 20) { // se este X estiver neste intervalo, incrementa a variável in
				in++;
			} else { // se estiver fora, incrementa out
				out++;
			}
			
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
			
		}
}
