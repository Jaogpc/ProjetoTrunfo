package com.mycompany.projetotrunfo;

import java.util.Scanner;

public class Batalha {

	void duelar(Jogador p1, Jogador p2) {
		Scanner entrada = new Scanner(System.in);

		int opcao;
                
		for(int i = 0; i < 5; i++) {
                    p1.monteCarta[i].exibirCarta();
                    System.out.println("Escolha o atributo: ");
                    opcao = entrada.nextInt();
			switch(opcao) {
			case 1:
				if(p1.monteCarta[i].forca >= p2.monteCarta[i].forca) {
					System.out.println("Você ganhou!!");
					p1.pontuacao++;
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 1");
                                        p1.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 2");
					p2.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
				} else {
					System.out.println("Você perdeu");
					p2.pontuacao++;
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 1");
                                        p1.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 2");
					p2.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
				} break;

			case 2:
				if(p1.monteCarta[i].inteligencia >= p2.monteCarta[i].inteligencia) {
					System.out.println("Você ganhou!!");
					p1.pontuacao++;
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 1");
                                        p1.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 2");
					p2.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
				} else {
					System.out.println("Você perdeu");
					p2.pontuacao++;
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 1");
                                        p1.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 2");
					p2.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
				} break;

			case 3:
				if(p1.monteCarta[i].constituicao >= p2.monteCarta[i].constituicao) {
					System.out.println("Você ganhou!!");
					p1.pontuacao++;
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 1");
                                        p1.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 2");
					p2.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
				} else {
					System.out.println("Você perdeu");
					p2.pontuacao++;
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 1");
                                        p1.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 2");
					p2.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
				} break;

			case 4:
				if(p1.monteCarta[i].carisma >= p2.monteCarta[i].carisma) {
					System.out.println("Você ganhou!!");
					p1.pontuacao++;
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 1");
                                        p1.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 2");
					p2.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
				} else {
					System.out.println("Você perdeu");
					p2.pontuacao++;
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 1");
                                        p1.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 2");
					p2.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
				} break;

			case 5:
				if(p1.monteCarta[i].fadiga <= p2.monteCarta[i].fadiga) {
					System.out.println("Você ganhou!!");
					p1.pontuacao++;
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 1");
                                        p1.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 2");
					p2.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
				} else {
					System.out.println("Você perdeu");
					p2.pontuacao++;
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 1");
                                        p1.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
                                        System.out.println("Cartas da rodada do player 2");
					p2.monteCarta[i].exibirCarta();
                                        System.out.println("---------------------------");
				} break;

			}
		}
	}

	void exibirPlacar(Jogador p1, Jogador p2) {
		System.out.println("Player 1 vs Player 2");
		System.out.println("    " + p1.pontuacao + "          " + p2.pontuacao);
	}
}