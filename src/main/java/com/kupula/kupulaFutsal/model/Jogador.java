package com.kupula.kupulaFutsal.model;

public class Jogador {

    private String nome;
    private Nivel nivel;
    private String apelido;

    public Jogador(String nome, Nivel nivel, String apelido) {
        this.nome = nome;
        this.nivel = nivel;
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}

