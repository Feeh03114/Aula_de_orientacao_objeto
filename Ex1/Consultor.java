public class Consultor extends Funcionario {

    private float percentual;

    public Consultor(String nome, float salario, float percentual) {
        super(nome, salario);
        this.percentual = percentual;
    }

    @Override
    public float getSalario() {
        return super.getSalario();
    }

    public float getSalario(float percentual) {
        return this.getSalario() + this.getSalario() * percentual / 100;
    }

    @Override
    public String toString() {
        return "\nNome = " + getNome() + "\nSalário = " + this.getSalario(this.percentual);
    }

}