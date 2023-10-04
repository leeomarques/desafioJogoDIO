package com.example;


public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Leonardo", 300, "Mago");
        Hero hero2 = new Hero("Silva", 500, "Guerreiro");
        Hero hero3 = new Hero("João", 20, "Monge");
        Hero hero4 = new Hero("Leo", 4500, "Ninja");


        System.out.println("Dados do " + hero1.tipo + " -> " + hero1.toString());
        hero1.attackMago();
        System.out.println("---------------------------------------------------");
        System.out.println("Dados do " + hero2.tipo + " -> " + hero2.toString());
        hero2.attackGuerreiro();
        hero2.toString();
        System.out.println("---------------------------------------------------");
        System.out.println("Dados do " + hero3.tipo + " -> " + hero3.toString());
        hero3.attackMonge();
        hero3.toString();
        System.out.println("---------------------------------------------------");
        System.out.println("Dados do " + hero4.tipo + " -> " + hero4.toString());
        hero4.attackNinja();
        hero4.toString();
        System.out.println("---------------------------------------------------");
    }
}