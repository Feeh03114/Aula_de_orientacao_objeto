import java.util.ArrayList;

public class Pessoa {

    private Integer codigo;
    private String nome;
    private ArrayList<Automovel> automoveis;

    public Pessoa() {
    }

    public Pessoa(int codigo, String nome, ArrayList<Automovel> automoveis) {
        this.codigo = codigo;
        this.nome = nome;
        this.automoveis = automoveis;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Automovel> getAutomovels() {
        return automoveis;
    }

    public void setAutomoveis(ArrayList<Automovel> automoveis) {
        this.automoveis = automoveis;
    }

    public String imprimir() {
        return "Codigo: " + codigo + "\n" + "Nome: " + nome;
    }

    public String imprimirCompleto() {
        return "Codigo: " + codigo + "\n" + "Nome: " + nome + "\n" + "Carros da pessoa: " + automoveis;
    }

}