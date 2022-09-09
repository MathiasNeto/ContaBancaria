package br.edu.fafic.es.model;

import br.edu.fafic.es.interfaces.IAtendente;

public class Atendente extends Pessoa implements IAtendente {
    @Override
    public void emitircartao(Conta conta, String numerocartao) {
        System.out.println("Cartão Nº: "+numerocartao+" " +
                "Emitido com sucesso para conta Nº: "+conta.getNum_Conta());
    }

    @Override
    public void alterarlimiteconta(Contacorrente contacorrente, Double novoLimite) {
        System.out.println(
                "Limite: "+novoLimite+" Adicionado para conta: "+contacorrente.getNum_Conta()
        );
    } //extends pega todas as informaçoes de pessoa


}
