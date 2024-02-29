public class Filme {
    String titulo;
    String descricao;
    int anoLancamento;
    boolean incluidoNoPlano;
    String genero;
    int classificacaoIndicativa;
    double avaliacaoIbm;
    double totalAvaliacao;
    double avaliacaoGeral;
    int duracaoEmMinutos;



    void exibirInformacoes() {
        System.out.println("Titulo: " +titulo);
        System.out.println("Descrição:  " +descricao);
        System.out.println("Ano de Lançamento: " +anoLancamento);
        System.out.println("Pertence ao  plano: " + incluidoNoPlano);
        System.out.println("Genero: " + genero);
        System.out.println("Classificação indicativa: " +classificacaoIndicativa);
        System.out.println("Avaliação Ibm: " +avaliacaoIbm);
        System.out.println("Duração: "+duracaoEmMinutos + " min");

    }

    void avaliar(double nota){
        totalAvaliacao += nota;
        avaliacaoGeral ++;
        int media = (int) (totalAvaliacao / avaliacaoGeral);
        avaliacaoIbm = media;
        return;

    }
}
