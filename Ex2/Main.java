public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(70);

        Arroz arroz = new Arroz(1000);
        Feijao feijao = new Feijao(50);
        Sorvete sorvete = new Sorvete(500);

        pessoa.comer(arroz);
        pessoa.comer(feijao);
        pessoa.comer(sorvete);

        System.out.print("Novo peso: " + pessoa.getPeso() + "Kg");

    }
}