package com.kupula.kupulaFutsal.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Sorteio {

    private Set<Jogador> jogadores;

    public List<Time> sortearTimes() {

        final Map<Nivel, List<Jogador>> jogadoresPorNivel = jogadores.stream().collect(Collectors.groupingBy(Jogador::getNivel));

        final Time a = new Time("A");
        final Time b = new Time("B");
        final Time c = new Time("C");
        final Time d = new Time("D");
        List<Time> times =  Arrays.asList(a, b, c, d);

        times.forEach(time -> {
            jogadoresPorNivel.forEach( (nivel, jogadores) -> {
                Jogador jogador = jogadores.stream().findAny().orElseThrow(RuntimeException::new);
                time.adicionarJogador(jogador);
                jogadores.remove(jogador);
            } );
        });

        return times;


//        Map<Nivel, Set<Jogador>> jogadoresPorNivel = new HashMap<>();
//        for (Jogador jogador : jogadores){
//            if(jogadoresPorNivel.containsKey(jogador.getNivel())){
//                jogadoresPorNivel.get(jogador.getNivel()).add(jogador);
//            }else {
//                HashSet<Jogador> jogadoresDoNivel = new HashSet<>();
//                jogadoresDoNivel.add(jogador);
//                jogadoresPorNivel.put(jogador.getNivel(),jogadoresDoNivel);
//            }
//        }

    }
}
