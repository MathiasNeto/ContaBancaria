package br.edu.fafic.es.model;

import br.edu.fafic.es.enums.TipoMovimentacao;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    private String agencia_Conta;
    private String num_Conta;
    private Integer digito_Conta;
    private Double saldo_Conta;
    private List<Movimentacao> movimentacoes;

//Uma classe abstracta é um modelo para todas as suas subclasses


    public Conta(String agencia_Conta, String num_Conta, Integer digito_Conta, Double saldo_Conta) {
        this.agencia_Conta = agencia_Conta;
        this.num_Conta = num_Conta;
        this.digito_Conta = digito_Conta;
        this.saldo_Conta = saldo_Conta;
        this.movimentacoes = new ArrayList<>();
    }




    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public String getAgencia_Conta() {
        return agencia_Conta;
    }

    public void setAgencia_Conta(String agencia_Conta) {
        this.agencia_Conta = agencia_Conta;
    }

    public String getNum_Conta() {
        return num_Conta;
    }

    public void setNum_Conta(String num_Conta) {
        this.num_Conta = num_Conta;
    }

    public Integer getDigito_Conta() {
        return digito_Conta;
    }

    public void setDigito_Conta(Integer digito_Conta) {
        this.digito_Conta = digito_Conta;
    }

    public Double getSaldo_Conta() {
        return saldo_Conta;
    }

    public void setSaldo_Conta(Double saldo_Conta) {
        this.saldo_Conta = saldo_Conta;
    }

    public void depositar(Double valor){
        if (valor < 1){
            throw new IllegalArgumentException("Valor deve ser maior que 1(um) real");
        }
        this.saldo_Conta+=valor;
        //garante que o nome não vá errado para o banco
        Movimentacao movimentacao = new Movimentacao(TipoMovimentacao.DEPOSITO,valor);
        this.movimentacoes.add(movimentacao);
    }

    public Double sacar(Double valor_saque){
        if (valor_saque > this.saldo_Conta){
            throw new IllegalArgumentException("Saldo insuficiente !");
        }
        this.saldo_Conta-=valor_saque;
        Movimentacao movimentacao = new Movimentacao(TipoMovimentacao.SAQUE,valor_saque);
        this.movimentacoes.add(movimentacao);
        return saldo_Conta;
    }
    public void transfere(Conta conta_destino, Double valor_transfere){
        this.sacar(valor_transfere);
        conta_destino.depositar(valor_transfere);
    }
    public abstract void imp_extract(); //Abstract é um modelo geral da outras
}
