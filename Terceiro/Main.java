package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Main03 {

	private static Funcionario funcionario1;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			funcionario1 = null;

			while (true) {

				System.out.println("===MENU===");
				System.out.println("1 - Criar funcionario");
				System.out.println("2 - Mostrar folha de pagamento");
				System.out.println("3 - Alterar remuneracao");
				System.out.println("4 - Sair");
				int escolha = sc.nextInt();

				if (escolha == 1) {
					System.out.println("Cracha: ");
					int cracha = sc.nextInt();
					System.out.println("Nome: ");
					String nome = sc.next();
					System.out.println("Tipo de vinculo: ");
					char tipoVinculo = sc.next().charAt(0);
					System.out.println("Valor da hora: ");
					float valorHora = sc.nextFloat();
					System.out.println("Quantidade de horas: ");
					float qtdeHora = sc.nextFloat();
					System.out.println("Salario: ");
					float salario = sc.nextFloat();
					System.out.println("Valor de Desconto: ");
					float valorDesconto = sc.nextFloat();

					funcionario1 = new Funcionario(cracha, nome, valorHora, qtdeHora, salario, valorDesconto,
							tipoVinculo);

					funcionario1.calcularSalario();

				} else if (escolha == 2) {
					if (funcionario1 != null) {

						System.out.println(funcionario1.imprimir());
					} else {
						System.out.println("Funcionario não existente");
					}
				} else if (escolha == 3) {
					if (funcionario1.tipoVinculo == ('H')) {
						System.out.println("Digite o valor da hora: ");
						float valorHora = sc.nextFloat();
						funcionario1.setValorHora(valorHora);
						System.out.println("Digite a quantidade de horas: ");
						float qtdHoras = sc.nextFloat();
						funcionario1.setQtdeHora(qtdHoras);
						funcionario1.calcularSalario();
					} else {
						System.out.println("Digite um novo salario: ");
						float salario = sc.nextFloat();
						funcionario1.setSalario(salario);
					}
				} else {
					System.out.println("Saindo");
					sc.close();
					return;
				}

			}
		}
	}

}