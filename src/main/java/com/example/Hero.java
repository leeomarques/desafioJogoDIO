package com.example;

public class Hero {

    String nome;
    int idade;
    String tipo;

    public Hero(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void attackMago() {
        System.out.println("O " + getTipo() + " atacou usando magia");
    }

    public void attackGuerreiro() {
        System.out.println("O " + getTipo() + " atacou usando espada");
    }

    public void attackMonge() {
        System.out.println("O " + getTipo() + " atacou usando artes marciais");
    }

    public void attackNinja() {
        System.out.println("O " + getTipo() + " atacou usando shuriken");
    }

    @Override
    public String toString() {
        return "{ " + "nome: " + nome + ", idade: " + idade + " anos, tipo: " + tipo + "}";
    }
}
