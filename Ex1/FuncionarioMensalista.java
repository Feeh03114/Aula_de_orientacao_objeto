public class FuncionarioMensalista extends Funcionario {
    private double salario;

    public FuncionarioMensalista() {
    }

    public FuncionarioMensalista(int numeroCracha, String nome, String setro, String funcao, double salario) {
        super(numeroCracha, nome, setro, funcao);
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalário = " + getSalario();
    }
}
