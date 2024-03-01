package br.com.devleofulco.screenmatch.entity;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public Serie(String titulo, String descricao, int anoLancamento, boolean incluidoNoPlano,
                 String genero, int classificacaoIndicativa, double avaliacaoIbm,
                 int temporadas, int episodiosPorTemporada, boolean ativa, int minutosPorEpisodio) {
        super(titulo, descricao, anoLancamento, incluidoNoPlano, genero, classificacaoIndicativa, avaliacaoIbm);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.ativa = ativa;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    // Método para exibir informações
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método exibirInformacoes da superclasse Titulo
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episódios por temporada: " + episodiosPorTemporada);
        System.out.println("Ativa: " + (ativa ? "Sim" : "Não"));
        System.out.println("Minutos por episódio: " + minutosPorEpisodio);
    }
}
