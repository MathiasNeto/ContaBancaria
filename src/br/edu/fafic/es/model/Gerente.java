package br.edu.fafic.es.model;

import br.edu.fafic.es.interfaces.IAtendente;
import br.edu.fafic.es.interfaces.IGerente;

public class Gerente extends Pessoa implements IGerente, IAtendente {

    @Override
    public void AbirConta(Conta conta) {
        System.out.println("Conta Aberta: "+conta.toString());
    }

    @Override
    public void RealizarEmprestimo(Contacorrente contacorrente, Double valoremprestimo) {
        contacorrente.setSaldo_Conta(contacorrente.getSaldo_Conta()+valoremprestimo);
        System.out.println("Empréstimo realizado com sucesso, seu saldo é de: "+contacorrente.getSaldo_Conta());
    }

    @Override
    public void emitircartao(Conta conta, String numerocartao) {
        System.out.println("Cartão Nº: "+numerocartao+" " +
                "Emitido com sucesso para conta Nº: "+conta.getNum_Conta());
    }

    @Override
    public void alterarlimiteconta(Contacorrente contacorrente, Double novoLimite) {
        System.out.println(
                "Limite: "+novoLimite+" Adicionado para conta: "+contacorrente.getNum_Conta());
    }
}
