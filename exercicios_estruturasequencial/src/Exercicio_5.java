import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, quant1, quant2;
		double valor1, valor2, total;

		System.out.printf("Digite o código da Peça: ");
		cod1 = sc.nextInt();
		System.out.printf("Digite a quantidade Peças n° %d: ", cod1);
		quant1 = sc.nextInt();
		System.out.printf("Digite o valor unitário da Peça n° %d: ", cod1);
		valor1 = sc.nextDouble();

		System.out.printf("Digite o código de outra Peça: ");
		cod2 = sc.nextInt();
		System.out.printf("Digite a quantidade Peças %d: ", cod2);
		quant2 = sc.nextInt();
		System.out.printf("Digite o valor unitário da Peça %d: ", cod2);
		valor2 = sc.nextDouble();
		
		total = (quant1 * valor1) + (quant2 * valor2);
		System.out.printf("O Valor Total a Pagar R$: %.2f%n" , total);

		sc.close();

	}

}
