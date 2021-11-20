public class Funcionario extends Pessoa {

    private int numeroCracha;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, int numeroCracha, double salario) {
        super(nome, cpf);
        this.salario = salario;
        this.numeroCracha = numeroCracha;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double getNumeroCrachar() {
        return this.numeroCracha;
    }

    public void setNumeroCrachar(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero Cracha = " + getNumeroCrachar() + "\nSalario = " + getSalario();
    }
}
