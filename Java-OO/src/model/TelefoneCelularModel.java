package model;

public class TelefoneCelularModel {
    private String marca, modelo, sistemaOperacional;
    private int ano, armazenamento;
    private boolean ligado;

    public TelefoneCelularModel(String marca, String modelo, String sistemaOperacional, int ano, int armazenamento, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.ano = ano;
        this.armazenamento = armazenamento;
        this.ligado = ligado;
    } 

    // Getters and Setters

    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }

    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getSistemaOperacional() { return sistemaOperacional; }

    public void setSistemaOperacional(String sistemaOperacional) { this.sistemaOperacional = sistemaOperacional; }

    public int getAno() { return ano; }

    public void setAno(int ano) { this.ano = ano; }

    public int getArmazenamento() { return armazenamento; }

    public void setArmazenamento(int armazenamento) { this.armazenamento = armazenamento; }

    public boolean isLigado() { return ligado; }

    public void setLigado(boolean ligado) { this.ligado = ligado; }
}