public class Aluno extends Pessoa {
    private String ra;
    private String curso;

    public Aluno() {
    }

    public Aluno(String ra, String nome, String cpf, String curso) {
        super(nome, cpf);
        this.ra = ra;
        this.curso = curso;
    }

    public String getRA() {
        return this.ra;
    }

    public void setRA(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.ra = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRa = " + getRA() + "\nCurso = " + getCurso();
    }
}
