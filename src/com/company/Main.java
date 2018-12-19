//Edson de Araujo Corral 2018
package com.company;

public class Main {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.titular = new Cliente();
        primeiraConta.titular.nome = "Edson de Araujo Corral";
        primeiraConta.titular.cpf = "066.202.869.41";
        primeiraConta.titular.profissao = "Adm de Redes";
        primeiraConta.setAgencia(3323);
        primeiraConta.setNumero(232434545);

        primeiraConta.deposito(2500); //add R$2500

        System.out.println("Nome: " + primeiraConta.titular.nome + " CPF: " + primeiraConta.titular.cpf +
                " Profissao: " + primeiraConta.titular.profissao);
        System.out.println("Agencia: " + primeiraConta.getAgencia() + " Numero: " + primeiraConta.getNumero());
        System.out.println("SALDO: R$" + primeiraConta.getSaldo());
    }
}
