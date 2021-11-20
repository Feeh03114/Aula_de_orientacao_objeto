import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Disciplina disciplina = new Disciplina();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("\nMenu: \n1 – Inserir Disciplina \n2 – Inserir Professor \n3 – Inserir Atendente"
                    + "\n4 – Inserir Aluno \n5 – Adicionar Disciplina ao Professor \n6 – Mostrar Pessoas   \n7 – Sair  \n");
            int menu = sc.nextInt();
            switch (menu) {
            case 1:
                System.out.print("Código da disciplina: ");
                int codigo = sc.nextInt();

                System.out.print("Nome: ");
                String name_disciplina = sc.next();

                Disciplina disciplina_new = new Disciplina(codigo, name_disciplina);
                disciplina.setListDisciplina(disciplina_new);
                break;
            case 2:
                inserirPessoa(sc, pessoas, professores, "professor");
                break;
            case 3:
                inserirPessoa(sc, pessoas, professores, "Atendente");
                break;
            case 4:
                inserirPessoa(sc, pessoas, professores, "Aluno");
                break;
            case 5:
                InserirDisciplinaProfessor(sc, pessoas, professores, disciplina);
                break;
            case 6:
                pessoas.forEach(f -> System.out.println(f));
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.print("Digite valor valido");
                break;
            }
        }
    }

    private static void inserirPessoa(Scanner sc, ArrayList<Pessoa> pessoas, ArrayList<Professor> professores,
            String tipo) {

        System.out.print("Nome: ");
        String nome = sc.next();

        System.out.print("cpf: ");
        String cpf = sc.next();
        if (tipo == "professor" || tipo == "Atendente") {

            System.out.print("Número do cracha: ");
            int numbCrachar = sc.nextInt();

            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            if (tipo == "professor") {

                System.out.print("Url Curriculo Lattes: ");
                String urlCurriculoLattes = sc.next();

                Professor funcionario = new Professor(nome, cpf, numbCrachar, salario, urlCurriculoLattes,
                        new ArrayList<Disciplina>());
                professores.add(funcionario);
                pessoas.add(funcionario);

            } else if (tipo == "Atendente") {
                System.out.print("Função: ");
                String funcao = sc.next();

                System.out.print("Setor: ");
                String setor = sc.next();

                Atendente atendente = new Atendente(nome, cpf, setor, funcao, numbCrachar, salario);
                pessoas.add(atendente);

            }
        } else if (tipo == "Aluno") {
            System.out.print("RA: ");
            String ra = sc.next();

            System.out.print("Curso: ");
            String curso = sc.next();

            Aluno aluno = new Aluno(nome, cpf, ra, curso);
            pessoas.add(aluno);
        }
    }

    private static void InserirDisciplinaProfessor(Scanner sc, ArrayList<Pessoa> pessoas,
            ArrayList<Professor> professores, Disciplina disciplina) {

        System.out.print("Nome: ");
        String nome = sc.next();

        System.out.print("CPF: ");
        String cpf = sc.next();

        for (Professor professor : professores) {
            if (professor.getNome().equals(nome) || professor.getCPF().equals(cpf)) {
                System.out.print("Disciplinas: ");
                disciplina.getListDisciplina().forEach(f -> System.out
                        .print("\n\s\sCódigo: " + f.getCodigo() + "\n\s\sDisciplina: " + f.getNomeDisciplina() + "\n"));

                System.out.print("Código da disciplina para adicionar no professor: ");
                int codigo_disciplina = sc.nextInt();
                disciplina.getListDisciplina().forEach(f -> {
                    if (f.getCodigo() == codigo_disciplina) {
                        professor.AddDicisplina(f);
                        System.out.print("Adicionado com sucesso");
                    }
                });
            }
        }
    }
}