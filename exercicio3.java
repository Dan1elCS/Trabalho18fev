package trabalho18fev;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		double n1, n2,n3,n4, media;
		
		System.out.println("1° Salário: ");
		n1 = new Scanner(System.in).nextDouble();
		System.out.println("2° Salário: ");
		n2 = new Scanner(System.in).nextDouble();
		System.out.println("3° Salário: ");
		n3 = new Scanner(System.in).nextDouble();
		System.out.println("4° Salário: ");
		n4 = new Scanner(System.in).nextDouble();
		
		media = (n1 + n2 + n3 + n4) / 4; 

		System.out.println("A média da empresa será R$:" + media);

	}

}
