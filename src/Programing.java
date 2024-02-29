public class Programing {
    public static void main(String[] args) {
        Filme novoFilme = new Filme();

        novoFilme.titulo = "Harry Potter";
        novoFilme.anoLancamento = 2001;
        novoFilme.genero = "Fantasia";
        novoFilme.duracaoEmMinutos = 120;
        novoFilme.classificacaoIndicativa = 10;
        novoFilme.avaliacaoIbm = 0;
        novoFilme.descricao = "Filme de fantasia";
        novoFilme.incluidoNoPlano = true;


        novoFilme.avaliar(6);
        novoFilme.avaliar(7.5);
        novoFilme.avaliar(8.7);
        novoFilme.avaliar(9);
        novoFilme.avaliar(3);
        novoFilme.avaliar(5);
        novoFilme.avaliar(4);

        System.out.println(novoFilme.totalAvaliacao);
        System.out.println(novoFilme.avaliacaoGeral);
        System.out.println(novoFilme.avaliacaoIbm);
    }
}