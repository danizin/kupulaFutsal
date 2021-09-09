package com.kupula.kupulaFutsal.model;

import java.util.HashSet;
import java.util.Set;

public class Time {


    private String nome;
    private Set<Jogador> jogadores;

    public Time(String nome) {
        this.nome = nome;
        jogadores = new HashSet<>();
    }

    public void adicionarJogador(Jogador jogador){
        jogadores.add(jogador);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Jogador> getJogadores() {
        return jogadores;
    }

}
