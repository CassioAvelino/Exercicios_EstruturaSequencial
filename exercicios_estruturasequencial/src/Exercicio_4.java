import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int num, horas;
		double valorHoras, salario;
		
		System.out.printf("Você é o funcionario n°: ");
		num = sc.nextInt();
		System.out.printf("Quantas horas você trabalhou: ");
		horas = sc.nextInt();
		System.out.printf("Quanto vale sua hora de trabalho: ");
		valorHoras = sc.nextDouble();
		
		salario = horas*valorHoras;
		System.out.printf("Funcionario [%d] | Salário U$: %.2f%n", num, salario);
		
		sc.close();
	}

}
