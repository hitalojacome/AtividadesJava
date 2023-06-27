package model;

import java.util.Date;

public class FestaAniversarioModel {
    private String nomeAniversariante, tema;
    private int idade, convidados;
    private Date data;

    public FestaAniversarioModel(String nomeAniversariante, String tema, int idade, int convidados, Date data) {
        this.nomeAniversariante = nomeAniversariante;
        this.tema = tema;
        this.idade = idade;
        this.convidados = convidados;
        this.data = data;
    }

    // Getters and Setters

    public String getNomeAniversariante() { return nomeAniversariante; }

    public void setNomeAniversariante(String nomeAniversariante) { this.nomeAniversariante = nomeAniversariante; }

    public String getTema() { return tema; }

    public void setTema(String tema) { this.tema = tema; }

    public int getIdade() { return idade; }

    public void setIdade(int idade) { this.idade = idade; }

    public int getConvidados() { return convidados; }

    public void setConvidados(int convidados) { this.convidados = convidados; }

    public Date getData() { return data; }

    public void setData(Date data) { this.data = data; }
}
