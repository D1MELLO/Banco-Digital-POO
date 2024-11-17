package com.dio.sergio;

import java.util.Date;

public class Transacao {
    private String tipo;
    private double valor;
    private Date data;
    private Conta origem;
    private Conta destino;

    public Transacao(String tipo, double valor, Conta origem, Conta destino) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = new Date(); // Data da transação
        this.origem = origem;
        this.destino = destino;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public Conta getOrigem() {
        return origem;
    }

    public Conta getDestino() {
        return destino;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "tipo='" + tipo + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                ", origem=" + origem.getNumero() +
                ", destino=" + (destino != null ? destino.getNumero() : "Nenhum") +
                '}';
    }
}
