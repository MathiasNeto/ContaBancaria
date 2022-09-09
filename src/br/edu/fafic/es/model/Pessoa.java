package br.edu.fafic.es.model;

import br.edu.fafic.es.enums.Genero;

public class Pessoa {
    private Genero genero;
    private String nome;
    private String cpf;

    public Genero getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "genero='" + genero + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
