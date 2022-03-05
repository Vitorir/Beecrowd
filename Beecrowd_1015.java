// 1015 - Distância Entre Dois Pontos

import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
		
	    // Entrada
	    double x1, x2, y1, y2;
		x1 = s.nextDouble();
		y1 = s.nextDouble();
		x2 = s.nextDouble();
		y2 = s.nextDouble();
	    
	    // importar biblioteca Math (import java.lang.Math)
    	    double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); 
    		
	    System.out.printf("%.4f\n", distancia); 
    }
 
}
