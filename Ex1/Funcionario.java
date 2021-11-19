public class Funcionario {

    private int numeroCracha;
    private String nome;
    private String setor;
    private String funcao;

    public Funcionario() {
    }

    public Funcionario(int numeroCracha, String nome, String setor, String funcao) {
        this.numeroCracha = numeroCracha;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
    }

    public int getNumeroCracha() {
        return this.numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        return "\nNumero do Cracha = " + getNumeroCracha() + "\nNome = " + getNome() + "\nSetor = " + getSetor()
                + "\nFunção = " + getFuncao();
    }

}