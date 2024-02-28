public class Programing {
    public static void main(String[] args) {
        Filme novoFilme = new Filme();

        novoFilme.titulo = "Harry Potter";
        novoFilme.anoLancamento = 2001;
        novoFilme.genero = "Fantasia";
        novoFilme.duracaoEmMinutos = 120;
        novoFilme.classificacaoIndicativa = 10;
        novoFilme.avaliacaoIbm = 9.5;
        novoFilme.descricao = "Filme de fantasia";
        novoFilme.incluidoNoPlano = true;

        System.out.println(novoFilme.titulo);
        System.out.println(novoFilme.anoLancamento);
        System.out.println(novoFilme.genero);
        System.out.println(novoFilme.duracaoEmMinutos + " min");
        System.out.println(novoFilme.classificacaoIndicativa);
    }
}