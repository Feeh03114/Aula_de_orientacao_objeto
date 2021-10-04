package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites2.Aluno;
import entities.Curso;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Curso> list = new ArrayList<Curso>();

		// ArrayList<Curso> list = new ArrayList<Curso>();

		List<Aluno> list1 = new ArrayList<Aluno>();

		Curso crs = new Curso();
		Aluno aln = new Aluno();

		while (true) {

			System.out.println("===MENU===");
			System.out.println("1-Criar Curso \n2-Criar Aluno \n3-Remover Aluno"
					+ "\n4-Mostrar Todos os Cursos \n5-Mostrar Alunos do Cruso" + "\n6-Sair");
			int escolha = sc.nextInt();

			switch (escolha) {
				case 1:
					System.out.println("Deseja criar quantos cursos: ");
					int C = sc.nextInt();

					for (int i = 0; i < C; i++) {
						System.out.println("Criando cruso");
						System.out.println("Codigo do curso: ");
						Integer codigo = sc.nextInt();
						System.out.println("Nome: ");
						sc.nextLine();
						String nomeCurso = sc.nextLine();
						System.out.println("Carga hoararia: ");
						Integer cargaHoraria = sc.nextInt();

						crs = new Curso(codigo, nomeCurso, cargaHoraria, (ArrayList<Aluno>) list1);

						list.add(crs);
					}

					break;
				case 2:
					System.out.println("Deseja adicionar quantos alunos: ");
					int N = sc.nextInt();
					for (int i = 0; i < N; i++) {
						System.out.println("Aluno #" + (i + 1) + " :");
						System.out.println("Nome: ");
						sc.nextLine();
						String nome = sc.nextLine();
						System.out.println("RA do aluno: ");
						String ra = sc.next();
						System.out.println("Escolha o curso: ");
						String curso = sc.next();

						aln = new Aluno(nome, ra);

						list1.add(aln);
					}
					break;
				case 3:
					System.out.println("Remover aluno: ");
					System.out.println("Insira o RA do aluno que deseja remover: ");
					int nra = sc.nextInt();

					boolean econtrado = false;
					for (int i = 0; i < list1.size(); i++) {
						if (list1.get(i).getRa().equals(nra)) {
							list1.remove(i);
							econtrado = true;
						}
					}
					if (!econtrado) {
						System.out.println("Aluno não encontrado");
					}
					break;
				case 4:
					System.out.println("Mostrando todos os cursos");
					System.out.println(crs.imprimirCurso());
					break;
				case 5:
					System.out.println("Mostrando todos os alunos");
					System.out.println(crs.imprimirCursoCompleto());
					break;
				case 6:
					System.out.println("Encerrando o programa");
					sc.close();
					return;
			}
		}
	}
}