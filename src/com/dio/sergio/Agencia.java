package com.dio.sergio;

import java.util.HashMap;
import java.util.Map;

public class Agencia {
    private String nome;
    private String codigo;
    private Map<String, Cliente> clientes;

    public Agencia(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.clientes = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getCpf(), cliente);
    }

    public Cliente buscarCliente(String cpf) {
        return clientes.get(cpf);
    }

    public void transferirEntreClientes(String cpfOrigem, String cpfDestino, double valor) {
        Cliente clienteOrigem = buscarCliente(cpfOrigem);
        Cliente clienteDestino = buscarCliente(cpfDestino);

        if (clienteOrigem != null && clienteDestino != null) {
            Conta contaOrigem = clienteOrigem.getContas().get(0); // Supondo que a primeira conta seja usada
            Conta contaDestino = clienteDestino.getContas().get(0);
            contaOrigem.transferir(valor, contaDestino);
        } else {
            System.out.println("Cliente(s) não encontrado(s) para a transferência.");
        }
    }
}

