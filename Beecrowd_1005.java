import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
		
		double A = s.nextDouble();
		double B = s.nextDouble();
		
		double soma = 3.5 * A + 7.5 * B;
		double MEDIA = soma / 11;

		System.out.println(String.format("MEDIA = %.5f", MEDIA));
    }
 
}
