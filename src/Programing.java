public class Programing {
    public static void main(String[] args) {
        // Criando um novo filme utilizando o construtor
        Filme novoFilme = new Filme("Harry Potter", "Filme de fantasia", 2001, true, "Fantasia", 10, 120);

        // Adicionando avaliações
        novoFilme.adicionarAvaliacao(6);
        novoFilme.adicionarAvaliacao(7);
        novoFilme.adicionarAvaliacao(8);
        novoFilme.adicionarAvaliacao(9);
        novoFilme.adicionarAvaliacao(3);
        novoFilme.adicionarAvaliacao(5);
        novoFilme.adicionarAvaliacao(4);

        // Exibindo informações do filme e a avaliação IBM
        novoFilme.exibirInformacoes();
        System.out.println("Avaliação IBM: " + novoFilme.getAvaliacaoIbm());
    }
}
