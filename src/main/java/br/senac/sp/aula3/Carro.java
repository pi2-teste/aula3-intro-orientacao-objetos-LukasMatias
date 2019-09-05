/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;

/**
 *
 * @author lukas.mpereira
 */
public class Carro {

    private String cor, fabricante, Modelo,gasolina;
    private int velocidadeAtual;

    String[] rodas = new String[4];

    public Carro() {

    }

    Carro(int i) {
        
    }

    public String getCor(String cor) {
        return cor;
    }

    public void setCor(String pCor) {
        this.cor = pCor;
    }

    String getModelo() {
        return this.Modelo;

    }

    String getCor() {
        return cor;
    }


   String descreve() {

        if (this.Modelo == null) {
            return "Um carro";
        }
        if (this.cor == null) {
            return "Um " + this.Modelo;

        }
        return "Um " + this.Modelo + " na cor " + this.cor;
    }

    void setModelo(String seuOutroModelo) {
        this.Modelo = seuOutroModelo;
    }
}
