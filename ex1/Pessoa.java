public class Pessoa {

    private String cpf;
    private String nome;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return this.cpf;
    }

    public void setCPF(String cpf) {
        this.nome = cpf;
    }

    @Override
    public String toString() {
        return "\nNome = " + getNome() + "\nCPF = " + getCPF();
    }
}
