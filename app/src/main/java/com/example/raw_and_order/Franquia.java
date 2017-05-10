package com.example.raw_and_order;

public class Franquia {

    int id;
    String nome;
    String cnpj;

    public Franquia(){}

    public Franquia(int id, String nome, String cnpj){
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Franquia(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }

    //======================================================================

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
