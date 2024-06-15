package br.com.alura.screenmatch.teste;

public class Barco implements Transporte{

    private String codigo;
    private String placa;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public void deliver() {
        System.out.println("Entregando com barco");
    }
}
