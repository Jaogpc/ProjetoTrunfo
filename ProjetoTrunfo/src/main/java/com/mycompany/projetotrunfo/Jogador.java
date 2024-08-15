package com.mycompany.projetotrunfo;

public class Jogador {
    int pontuacao;
    Carta monteCarta[] = new Carta[5];
    
    Jogador(){
        pontuacao = 0;
        for(int i = 0; i <= 4; i++){
            Carta carta = new Carta();
            monteCarta[i] = carta;
        }
    }
    
    void exibirMonte(){
        for(int i = 0; i <=4; i++){
            monteCarta[i].exibirCarta();
        }
    }
}
