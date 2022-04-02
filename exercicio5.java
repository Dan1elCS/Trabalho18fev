package trabalho18fev;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		double V, R, A;
		
		System.out.println("Defina o Raio: ");
		R = new Scanner(System.in).nextDouble();
		System.out.println("Defina a Altura");
		A = new Scanner(System.in).nextDouble();
		
		
		
		V = 3.14159 * R * R * A;
				
			System.out.println("O volume é: " +  V);
	}

}
