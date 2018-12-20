//Edson de Araujo Corral 2018
package com.company;

public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular;
    private static int total; //atributo da classe

    //Construtor
    public Conta(int agencia, int numero) {
        Conta.total++;
        //System.out.println("O total de objetos criados: " + Conta.total);

        if(agencia >= 0 && numero >= 0) {
            this.agencia = agencia;
            this.numero = numero;
        } else {
            System.out.println("Agencia e Numero incompativeis");
        }
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }

        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }

        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
