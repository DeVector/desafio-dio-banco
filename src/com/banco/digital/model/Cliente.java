package com.banco.digital.model;

public class Cliente {

    private static int COUNT_ID = 0;

    private long id;

    private String name;

    private String cpf;

    private String email;

    private String senha;

    private int old;

    public Cliente (){}

    public Cliente (String name, String cpf, String email, String senha, int old){
        this.id = COUNT_ID++;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.old = old;
    }

    public long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public String getCpf() {
        return cpf.substring(0,3) + "." + cpf.substring(6,9) + "-" + cpf.substring(9);
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
