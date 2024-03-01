import br.com.devleofulco.screenmatch.entity.Filme;
import br.com.devleofulco.screenmatch.entity.Serie;

import java.time.LocalDate;

public class Programing {
    public static void main(String[] args) {
        // Criando um novo filme utilizando o construtor
        int anoAtual = LocalDate.now().getYear(); // Obtendo o ano atual do sistema
        Filme novoFilme = new Filme("Harry Potter", "Filme de fantasia", 2020, true, "Fantasia", 10, 120, 8, 10, "J.K. Rowling");

        if (novoFilme.getAnoLancamento() < 1900 || novoFilme.getAnoLancamento() > anoAtual) {
            System.out.println("Erro: O ano de lançamento do filme não está dentro do intervalo permitido.");
            return; // Encerrar o programa caso o ano seja inválido
        }

        // Adicionando avaliações no filme
        novoFilme.adicionarAvaliacao(8);
        novoFilme.adicionarAvaliacao(9);

        // Exibindo informações do filme e a avaliação IBM
        novoFilme.exibirInformacoes();

        System.out.println("==============================");

        // Criando uma nova série utilizando o construtor
        Serie GOT = new Serie("Game of Thrones", "Série de fantasia", 2011, true, "Fantasia", 18, 8.5, 8, 10, true, 60);


        // Adicionando avaliações na série
        GOT.adicionarAvaliacao(9);
        GOT.getMinutosPorEpisodio();
        GOT.exibirInformacoes();
        // Obtendo e exibindo o número de episódios por temporada da série
        int episodiosPorTemporada = GOT.getEpisodiosPorTemporada();
        System.out.println("Número de episódios por temporada da série: " + episodiosPorTemporada);
    }
}
