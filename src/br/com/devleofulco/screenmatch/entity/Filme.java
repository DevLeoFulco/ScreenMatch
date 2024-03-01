package br.com.devleofulco.screenmatch.entity;

public class Filme extends Titulo {
    private String diretor;

    public Filme(String titulo, String descricao, int anoLancamento, boolean incluidoNoPlano,
                 String genero, int classificacaoIndicativa, double avaliacaoIbm, int duracao, String diretor) {
        super(titulo, descricao, anoLancamento, incluidoNoPlano, genero, classificacaoIndicativa, avaliacaoIbm);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método exibirInformacoes da superclasse Titulo
        System.out.println("Diretor: " + diretor);
    }
}
