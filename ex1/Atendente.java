public class Atendente extends Funcionario {
    private String setor;
    private String funcao;

    public Atendente() {
    }

    public Atendente(String nome, String cpf, String setor, String funcao, int numeroCracha, double salario) {
        super(nome, cpf, numeroCracha, salario);
        this.funcao = funcao;
        this.setor = setor;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return this.funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSetor = " + getSetor() + "\nFunção = " + getFuncao();
    }
}
