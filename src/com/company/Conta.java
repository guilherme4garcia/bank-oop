package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Conta {
    public int numConta;
    protected Tipo tipo;
    private String dono;
    private int saldo;
    private boolean status;

    public Conta(String nome, Tipo tipo) {
        this.numConta = ThreadLocalRandom.current().nextInt();
        this.tipo = tipo;
        this.dono = nome;
        abrirConta();
    }

    public void abrirConta() {
        this.status = true;
        if(tipo == Tipo.CC) {
            this.saldo = 50;
        }
        if(tipo == Tipo.CP) {
            this. saldo = 150;
        }
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Não é possivel fechar uma conta com saldo. Saldo: " + this.saldo);
        }
        if (saldo < 0) {
            System.out.println("Você possui um débito, não é possível fechar a conta. Saldo: " + this.saldo);
        }
        if (saldo == 0) {
            this.status = false;
            System.out.println("Conta fechada.");
        }
    }

    public void depositar(int dinheiro) {
        if (this.status == true) {
            this.saldo += dinheiro;
            System.out.println(dinheiro + " depositado com sucesso! Saldo atual: " + this.saldo);
        } else {
            System.out.println("Não é possível depositar em uma conta fechada!");
        }
    }

    public void sacar(int dinheiro) {
        if (saldo < dinheiro) {
            System.out.println("ERRO! Você não tem saldo suficiente.");
        } else {
            this.saldo -= dinheiro;
            System.out.println(dinheiro + " SACADO. Saldo atual: " + this.saldo );
        }

    }

    public void pagarMensal() {

        if(tipo == Tipo.CC) {
            this.saldo -= 12;
        }
        if(tipo == Tipo.CP) {
            this.saldo -= 20;
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        System.out.println(dono);
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        System.out.println(saldo);
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        System.out.println(status);
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //    abrirConta() fecharConta() depositar() sacar() pagarMensal()
}
