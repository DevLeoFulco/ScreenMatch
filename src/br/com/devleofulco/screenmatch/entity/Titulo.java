package br.com.devleofulco.screenmatch.entity;

public class Titulo {
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

    public Titulo(String titulo, String descricao, int anoLancamento, boolean incluidoNoPlano, String genero, int classificacaoIndicativa, double avaliacaoIbm) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.anoLancamento = anoLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.genero = genero;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.avaliacaoIbm = avaliacaoIbm;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public double getAvaliacaoIbm() {
        return avaliacaoIbm;
    }

    public void setAvaliacaoIbm(double avaliacaoIbm) {
        this.avaliacaoIbm = avaliacaoIbm;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    public int getNumeroAvaliacoes() {
        return numeroAvaliacoes;
    }

    public void setNumeroAvaliacoes(int numeroAvaliacoes) {
        this.numeroAvaliacoes = numeroAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
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
