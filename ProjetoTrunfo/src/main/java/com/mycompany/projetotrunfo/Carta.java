package com.mycompany.projetotrunfo;
import java.util.Random;

public class Carta {
    int forca, inteligencia, constituicao, carisma, fadiga;
    String nome;
    
    void exibirCarta(){
        System.out.print("---Carta---\n");
        System.out.print("1 - Força: " + forca + "\n");
        System.out.print("2 - Inteligência: " + inteligencia + "\n");
        System.out.print("3 - Constituição: " + constituicao + "\n");
        System.out.print("4 - Carisma: " + carisma + "\n");
        System.out.print("5 - Fadiga: " + fadiga + "\n");
    }

    public Carta(){
        Random aleatorio = new Random();
        
        forca = aleatorio.nextInt(100);
        inteligencia = aleatorio.nextInt(100);
        constituicao = aleatorio.nextInt(100);
        carisma = aleatorio.nextInt(100);
        fadiga = aleatorio.nextInt(100);
        
    }
    
    public Carta(int forca, int inteligencia, int constituicao, int carisma, int fadiga, String nome) {
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.constituicao = constituicao;
        this.carisma = carisma;
        this.fadiga = fadiga;
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getFadiga() {
        return fadiga;
    }

    public void setFadiga(int fadiga) {
        this.fadiga = fadiga;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
        
    
    
}