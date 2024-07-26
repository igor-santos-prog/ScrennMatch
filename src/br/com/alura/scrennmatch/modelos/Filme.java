package br.com.alura.scrennmatch.modelos;
import br.com.alura.scrennmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLançamento) {
        super(nome, anoDeLançamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme:" + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }

}
