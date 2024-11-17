package com.dio.sergio;

public class Main {
    public static void main(String[] args) {
        // Criação de Banco e Agência
        Banco banco = new Banco();
        Agencia agencia = new Agencia("Agência Central", "001");

        // Criando Clientes
        Cliente cliente1 = new Cliente("Maria Silva", "12345678900");
        Cliente cliente2 = new Cliente("João Santos", "98765432100");

        // Criando Contas
        ContaCorrente contaMaria = new ContaCorrente("12345", 500.00);
        ContaPoupanca contaJoao = new ContaPoupanca("67890", 1000.00, 0.05);

        // Adicionando Contas aos Clientes
        cliente1.adicionarConta(contaMaria);
        cliente2.adicionarConta(contaJoao);

        // Adicionando Contas ao Banco e Clientes à Agência
        banco.adicionarConta(contaMaria);
        banco.adicionarConta(contaJoao);
        agencia.adicionarCliente(cliente1);
        agencia.adicionarCliente(cliente2);

        // Criando Cartões de Crédito
        CartaoCredito cartaoMaria = new CartaoCredito("1111-2222-3333-4444", 2000.00, contaMaria);
        CartaoCredito cartaoJoao = new CartaoCredito("5555-6666-7777-8888", 1000.00, contaJoao);

        // Realizando Operações nas Contas
        System.out.println("---- Operações nas Contas ----");
        contaMaria.depositar(200);
        contaJoao.sacar(100);
        contaJoao.aplicarRendimento();

        // Realizando Compras e Pagamentos com Cartões de Crédito
        System.out.println("\n---- Cartões de Crédito ----");
        cartaoMaria.realizarCompra(300);
        cartaoJoao.realizarPagamento(50);

        // Realizando Transferência entre Contas de Clientes Diferentes
        System.out.println("\n---- Transferência Entre Contas ----");
        agencia.transferirEntreClientes("12345678900", "98765432100", 150);

        // Exibindo Saldo das Contas após Operações
        System.out.println("\n---- Saldos Finais ----");
        banco.exibirSaldo("12345");
        banco.exibirSaldo("67890");

        // Exibindo Detalhes das Transações
        System.out.println("\n---- Detalhes das Transações ----");
        Transacao transacao1 = new Transacao("Depósito", 200, contaMaria, null);
        Transacao transacao2 = new Transacao("Saque", 100, contaJoao, null);
        Transacao transacao3 = new Transacao("Transferência", 150, contaMaria, contaJoao);

        System.out.println(transacao1);
        System.out.println(transacao2);
        System.out.println(transacao3);
    }
}
