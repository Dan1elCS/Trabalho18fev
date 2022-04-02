package trabalho18fev;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int sexo, qtMulheres = 0, qtHomens=0;
		float altura, somaH=0, mediaHomem=0, maior=0, menor=0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {	
			System.out.println("Escolha o sexo (1- Mulher, 2-Homem");
			sexo = entrada.nextInt();
			System.out.println("Digite a altura:");
			altura = entrada.nextFloat();
			if (sexo == 1) {
				qtMulheres++;	
			} else if (sexo == 2) {
				qtHomens++;
				somaH = somaH + altura;
			} else {
				System.out.println("Opção invalida!");
			}
			if(altura > maior) {
				maior = altura;
			} else if (altura < menor) {
				menor = altura;
			}
		}
		mediaHomem = somaH / qtHomens;
		System.out.println("Maior altura registrada: " + maior + "m,a menor é de " + menor +"m");
		System.out.println("A média de altura dos homens é: " + mediaHomem + "m");
		System.out.println("O númeron de mulheres é " + qtMulheres);
		
		entrada.close();
		
	}

}
