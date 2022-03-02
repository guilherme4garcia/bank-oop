package com.company;

public class Main {

    public static void main(String[] args) {
	    Conta jubileu = new Conta("Jubileu" ,Tipo.CP);
        Conta creuza = new Conta("Creuza", Tipo.CC);

        jubileu.depositar(500);
        creuza.depositar(500);

        jubileu.pagarMensal();
        creuza.pagarMensal();

        jubileu.getSaldo();
        creuza.getSaldo();


    }
}
