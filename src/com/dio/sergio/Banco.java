package com.dio.sergio;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Conta> contas;

    public Banco() {
        contas = new HashMap<>();
    }

    public void adicionarConta(Conta conta) {
        contas.put(conta.getNumero(), conta);
    }

    public Conta buscarConta(String numero) {
        return contas.get(numero);
    }

    public void exibirSaldo(String numero) {
        Conta conta = buscarConta(numero);
        if (conta != null) {
            System.out.println("Saldo da conta " + numero + ": R$" + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}
