package com.mycompany.projetotrunfo;

public class ProjetoTrunfo {

    public static void main(String[] args) {
        Carta carta = new Carta();
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        Batalha batalha = new Batalha();
        
        batalha.duelar(jogador1, jogador2);
        batalha.exibirPlacar(jogador1, jogador2);
        
    }
}
