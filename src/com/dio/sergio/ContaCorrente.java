package com.dio.sergio;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void aplicarRendimento() {
        System.out.println("Conta Corrente não possui rendimento.");
    }
}
