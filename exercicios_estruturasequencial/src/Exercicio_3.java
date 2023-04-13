import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;
		System.out.printf("Digite valor A: ");
		A = sc.nextInt();
		System.out.printf("Digite valor B: ");
		B = sc.nextInt();
		System.out.printf("Digite valor C: ");
		C = sc.nextInt();
		System.out.printf("Digite valor D: ");
		D = sc.nextInt();
		dif = (A * B - C * D);
		
		System.out.printf("A Diferença (%d * %d - %d * %d) = %d", A, B, C, D, dif);
		
		sc.close();
	}

}
