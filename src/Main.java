import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double salarioAntigo = sc.nextDouble();

		double percentual;

		if (salarioAntigo <= 400.00) {
			percentual = 15.0;
		} else if (salarioAntigo <= 800.00) {
			percentual = 12.0;
		} else if (salarioAntigo <= 1200.00) {
			percentual = 10.0;
		} else if (salarioAntigo <= 2000.00) {
			percentual = 7.0;
		} else {
			percentual = 4.0;
		}

		double reajuste = salarioAntigo * percentual / 100;
		double novoSalario = salarioAntigo + reajuste;

		System.out.printf("Novo salario: %.2f%n", novoSalario);
		System.out.printf("Reajuste gannho: %.2f%n", reajuste);
		System.out.printf("Em percentual: %.0f %%%n", percentual);

		sc.close();
	}

}
