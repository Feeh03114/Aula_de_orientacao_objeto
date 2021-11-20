import java.util.ArrayList;

public class Disciplina {
    private int codigo;
    private String nome;

    private ArrayList<Disciplina> _listDisciplina = new ArrayList<Disciplina>();

    public Disciplina() {
    }

    public Disciplina(int codigo, String nome) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void setListDisciplina(Disciplina disciplina) {
        this._listDisciplina.add(disciplina);
    }

    public ArrayList<Disciplina> getListDisciplina() {
        return this._listDisciplina;
    }

    public String getNomeDisciplina() {
        return this.nome;
    }

    public void setNomeDisciplina(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNome da Disciplina = " + getNomeDisciplina() + "\nFunção = " + getCodigo();
    }
}
