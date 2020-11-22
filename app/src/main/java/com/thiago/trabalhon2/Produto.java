package com.thiago.trabalhon2;

public class Produto {

    private int id;
    private String veiculo ,data;
    private double KmLitro, vGasolina, vEtanol;

    public Produto() { //construtor pra quando quiser criar um cadastro, aos poucos será adicionado.

    }

    public Produto(String veiculo, String data, double kmLitro, double vGasolina, double vEtanol) { //construtor para os produtos que não existem, não em ID, o mesmo é gerado de forma automática
        this.veiculo = veiculo;
        this.data = data;
        KmLitro = kmLitro;
        this.vGasolina = vGasolina;
        this.vEtanol = vEtanol;
    }

    public Produto(int id, String veiculo, String data, double kmLitro, double vGasolina, double vEtanol) { //construtor para os produtos que ja existem, ja vem com ID
        this.id = id;
        this.veiculo = veiculo;
        this.data = data;
        KmLitro = kmLitro;
        this.vGasolina = vGasolina;
        this.vEtanol = vEtanol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getKmLitro() {
        return KmLitro;
    }

    public void setKmLitro(double kmLitro) {
        KmLitro = kmLitro;
    }

    public double getvGasolina() {
        return vGasolina;
    }

    public void setvGasolina(double vGasolina) {
        this.vGasolina = vGasolina;
    }

    public double getvEtanol() {
        return vEtanol;
    }

    public void setvEtanol(double vEtanol) {
        this.vEtanol = vEtanol;
    }

}