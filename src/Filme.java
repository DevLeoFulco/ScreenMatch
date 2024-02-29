public class Filme {
    private String titulo;
    private String descricao;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private String genero;
    private int classificacaoIndicativa;
    private double avaliacaoIbm;
    private int totalAvaliacao;
    private int numeroAvaliacoes;
    private int duracaoEmMinutos;

    // Construtor
    public Filme(String titulo, String descricao, int anoLancamento, boolean incluidoNoPlano,
                 String genero, int classificacaoIndicativa, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.anoLancamento = anoLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.genero = genero;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public String getGenero() {
        return genero;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public double getAvaliacaoIbm() {
        return avaliacaoIbm;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Descrição:  " + descricao);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Pertence ao plano: " + incluidoNoPlano);
        System.out.println("Genero: " + genero);
        System.out.println("Classificação indicativa: " + classificacaoIndicativa);
        System.out.println("Avaliação IBM: " + avaliacaoIbm);
        System.out.println("Duração: " + duracaoEmMinutos + " min");
    }

    // Método para adicionar avaliação
    public void adicionarAvaliacao(int nota) {
        totalAvaliacao += nota;
        numeroAvaliacoes++;
        avaliacaoIbm = (double) totalAvaliacao / numeroAvaliacoes;
    }
}
