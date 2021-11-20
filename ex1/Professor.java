import java.util.ArrayList;

public class Professor extends Funcionario {

    private String urlCurriculoLattes;
    private ArrayList<Disciplina> disciplinas;

    public Professor() {
    }

    public Professor(String nome, String cpf, int numeroCracha, double salario, String urlCurriculoLattes,
            ArrayList<Disciplina> disciplinas) {
        super(nome, cpf, numeroCracha, salario);
        this.urlCurriculoLattes = urlCurriculoLattes;
        this.disciplinas = disciplinas;
    }

    public String getUrlCurriculoLattes() {
        return this.urlCurriculoLattes;
    }

    public void setUrlCurriculoLattes(String urlCurriculoLattes) {
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    public void AddDicisplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void removeDisciplina(int index) {
        this.disciplinas.remove(index);
    }

    public void getDisciplina(int index) {
        this.disciplinas.get(index);
    }

    public void removeDisciplinaIf(Disciplina disciplina) {
        this.disciplinas.removeIf(item -> item.equals(disciplina));
    }

    @Override
    public String toString() {
        String disciplinas_string = "\nDisciplinas: \n";

        for (Disciplina disciplina : this.disciplinas) {
            disciplinas_string += "\tCódigo" + disciplina.getCodigo() + "\tDisciplina" + disciplina.getNomeDisciplina();
        }

        return super.toString() + "\nUrlCurriculoLattes = " + getUrlCurriculoLattes() + disciplinas_string;
    }
}
