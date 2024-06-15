package br.com.alura.screenmatch.teste;

public class Main {
    public static void main(String[] args) {
        Transporte t = new Barco();
        t.deliver();
        t = new Caminhao();
        t.deliver();

        Caminhao c = new Caminhao();
        c.deliver();
        Barco b = new Barco();
        b.deliver();

    }
}
