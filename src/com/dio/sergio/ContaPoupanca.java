package com.dio.sergio;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numero, double saldo, double taxaRendimento) {
        super(numero, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void aplicarRendimento() {
        double rendimento = getSaldo() * taxaRendimento;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento de R$" + rendimento + " aplicado na Conta Poupança.");
    }
}
