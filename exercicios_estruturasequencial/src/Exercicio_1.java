import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, soma;
		
		System.out.printf("Digite 1° número: ");
		num1 = sc.nextInt();
		System.out.printf("Digite 2° número: ");
		num2 = sc.nextInt();
		soma = num1 + num2;
		
		System.out.println("A soma dos números: " + soma);
		
		sc.close();
	}

}
