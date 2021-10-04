import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<Pessoa>();

		// ArrayList<Curso> list = new ArrayList<Curso>();

		List<Automovel> list1 = new ArrayList<Automovel>();

		Pessoa crs = new Pessoa();
		Automovel aln = new Automovel();

		while (true) {

			System.out.println("===MENU===");
			System.out.println("1-Criar Pessoa \n2-Criar Automóvel \n3-Transferir Automóvel"
					+ "\n4-Mostrar Todas as Pessoas  \n5-Mostrar automóvel da pessoa" + "\n6-Sair");
			int escolha = sc.nextInt();

			switch (escolha) {
				case 1:
					System.out.println("Deseja criar quantas Pessoas: ");
					int C = sc.nextInt();

					for (int i = 0; i < C; i++) {
						System.out.println("Pessoa #" + (i + 1) + " :");
						System.out.println("Codigo da pessoa: ");
						Integer codigo = sc.nextInt();
						System.out.println("Nome: ");
						String nomePessoa = sc.next();

						crs = new Pessoa(codigo, nomePessoa, (ArrayList<Automovel>) list1);

						list.add(crs);
					}

					break;
				case 2:
					System.out.println("Deseja adicionar quantas automóvel: ");
					int N = sc.nextInt();
					for (int i = 0; i < N; i++) {
						System.out.println("Automóvel #" + (i + 1) + " :");
						System.out.println("marca: ");
						String marca = sc.next();
						System.out.println("modelo : ");
						String modelo = sc.next();

						aln = new Automovel(marca, modelo);

						list1.add(aln);
					}
					break;
				case 3:
					System.out.println("Traferindo Veículo: ");
					System.out.println("Insira o código da pessoa que vai transferir: ");
					int Opeople = sc.nextInt();
					System.out.println("marca do veículo: ");
					String marca = sc.next();
					System.out.println("modelo do veículo: ");
					String modelo = sc.next();
					System.out.println("Insira o código da pessoa para qual será tranferida: ");
					int Dpeople = sc.nextInt();
					boolean econtrado_veiculo = false;
					boolean econtrado_Opeople = false;
					boolean econtrado_Dpeople = false;
					for (int i2 = 0; i2 < list.size(); i2++) {
						if (list.get(i2).getCodigo() == Opeople) {
							ArrayList<Automovel> listCar = list.get(i2).getAutomovels();
							for (int i = 0; i < listCar.size(); i++) {
								if (listCar.get(i).getMarca().equals(marca)
										&& list1.get(i).getModelo().equals(modelo)) {
									ArrayList<Automovel> test = listCar.get(i);
									for (int i3 = 0; i3 < list.size(); i3++) {
										if (list.get(i3).getCodigo() == Dpeople) {
											list.get(i2).setAutomoveis(listCar.get(i));
											econtrado_Dpeople = true;
										}
									}
									if (!econtrado_Dpeople) {
										System.out.println("Pessoa de destino não encontrada");
									}
									test.remove();
									econtrado_veiculo = true;
								}
							}
							if (!econtrado_veiculo) {
								System.out.println("Veiculo não encontrado");
							}
							econtrado_Opeople = true;
						}
					}
					if (!econtrado_Opeople) {
						System.out.println("Pessoa de origem não encontrada");
					}

					break;
				case 4:
					System.out.println("Mostrando todas as pessoas");
					System.out.println(crs.imprimir());
					break;
				case 5:
					System.out.println("Mostrando todas as pessoas");
					System.out.println(crs.imprimirCompleto());
					break;
				case 6:
					System.out.println("Encerrando o programa");
					sc.close();
					return;
			}
		}
	}
}