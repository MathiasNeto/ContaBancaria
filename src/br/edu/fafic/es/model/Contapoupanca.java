package br.edu.fafic.es.model;

import br.edu.fafic.es.utils.Datautil;

import java.util.Date;
import java.util.List;

public class Contapoupanca extends Conta{

    protected static final Double RENDIMENTO = 0.6;
    public Contapoupanca(String agencia_Conta, String num_Conta, Integer digito_Conta, Double saldo_Conta) {
        super(agencia_Conta, num_Conta, digito_Conta, saldo_Conta);
    }

    @Override
    public void imp_extract() {
        System.out.println("Data do extrato: "+ Datautil.converterdatahora(new Date()));
        System.out.println("==================================");
        System.out.println("=============Extrato Poupança================");
        System.out.println("==================================");
        System.out.println();
        for (Movimentacao m : this.getMovimentacoes()) {
            System.out.println(m);
        }
        System.out.println("Saldo atual:  "+this.getSaldo_Conta());
        System.out.println("==================================");
        System.out.println("============= Fim ================");
        System.out.println("==================================");
    }
}
