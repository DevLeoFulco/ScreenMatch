package br.com.devleofulco.screenmatch.entity;

public class Filme extends Titulo {
    private String diretor;

    public Filme(String titulo, String descricao, int anoLancamento, boolean incluidoNoPlano, String genero, int classificacaoIndicativa, double avaliacaoIbm, int i, int i1, String s) {
        super(titulo, descricao, anoLancamento, incluidoNoPlano, genero, classificacaoIndicativa, avaliacaoIbm);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
