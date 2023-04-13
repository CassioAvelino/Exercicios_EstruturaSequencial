import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

		System.out.printf("Digite o valor A: ");
		A = sc.nextDouble();
		System.out.printf("Digite o valor B: ");
		B = sc.nextDouble();
		System.out.printf("Digite o valor C: ");
		C = sc.nextDouble();

		System.out.printf("%n-_-_-_ RESPOSTAS -_-_-_%n");
		triangulo = (A * C) / 2;
		System.out.printf("Triangulo: %.3f%n", triangulo);
		circulo = C * C * 3.14159;
		System.out.printf("Circulo: %.3f%n", circulo);
		trapezio = ((A + B) * C) / 2;
		System.out.printf("Trapezio: %.3f%n", trapezio);
		quadrado = B * B;
		System.out.printf("Quadrado: %.3f%n", quadrado);
		retangulo = A * B;
		System.out.printf("Retangulo: %.3f%n", retangulo);

		sc.close();
	}

}
