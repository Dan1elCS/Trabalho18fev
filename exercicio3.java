package trabalho18fev;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		double n1, n2,n3,n4, media;
		
		System.out.println("1� Sal�rio: ");
		n1 = new Scanner(System.in).nextDouble();
		System.out.println("2� Sal�rio: ");
		n2 = new Scanner(System.in).nextDouble();
		System.out.println("3� Sal�rio: ");
		n3 = new Scanner(System.in).nextDouble();
		System.out.println("4� Sal�rio: ");
		n4 = new Scanner(System.in).nextDouble();
		
		media = (n1 + n2 + n3 + n4) / 4; 

		System.out.println("A m�dia da empresa ser� R$:" + media);

	}

}
