//Edson de Araujo Corral 2018
package com.company;

public class Main {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(123, 123);
        Conta segundaConta = new Conta(123, 123);
        Conta terceiraConta = new Conta(123, 123);
        Conta quartaConta = new Conta(123, 123);
        Conta quintaConta = new Conta(123, 123);

        System.out.println("O Numero de Instancia: " + Conta.getTotal());
    }
}
