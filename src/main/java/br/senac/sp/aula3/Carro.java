package br.senac.sp.aula3;

// Classe para criar um Carro
public class Carro {

    // atributos do Carro
    private String cor, fabricante, modelo;
    private int Combustivel=0, gasolina = 20;
    public int max_gasolina = 40;
    String[] rodas = new String[4];

    // método para configurar o modelo do carro
    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // método para recuperar o modelo do carro
    String getModelo() {
        return this.modelo;
    }

    // método para configurar  a cor do carro
    public void setCor(String pCor) {
        this.cor = pCor;
    }

    // método para recuperar a cor do carro
    String getCor() {
        return cor;
    }

    // método para configurar a gasolina do caaro
    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    // método para recuperar a quantidade de gasolina disponivel do carro
    int getGasolina() {
        return gasolina;
    }

    // metodo para descrever o carro
    String descreve() {

        if (this.modelo == null) {
            return "Um carro";
        }
        if (this.cor == null) {
            return "Um " + this.modelo;

        }
        return "Um " + this.modelo + " na cor " + this.cor;
    }

    // método para abastecer o tanque do carro
    void abastece(int litros) {
        gasolina += litros;
        if (gasolina > 40) {
            gasolina = max_gasolina;

        }

    }

 
}
