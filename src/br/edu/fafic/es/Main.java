package br.edu.fafic.es;

import br.edu.fafic.es.enums.Genero;
import br.edu.fafic.es.model.*;

public class Main {
    public static void main(String[] args) {
//        Conta conta = new Conta("123","33333",2,2600.0);
//        System.out.println("Saldo inicial da conta " + conta.getSaldo_Conta());
//        conta.depositar(200.0);
//        System.out.println("Saldo atual da conta " + conta.getSaldo_Conta());
//        conta.sacar(350.0);
//        System.out.println("Saldo Final "+ conta.getSaldo_Conta());
//
//        System.out.println();
//
//        Conta conta1 = new Conta("1234","44433",7,130.0);
//        System.out.println("Saldo inicial da conta " + conta1.getSaldo_Conta());
//        conta1.depositar(2000.0);
//        System.out.println("Saldo atual da conta pós-deposito " + conta1.getSaldo_Conta());
//        conta1.sacar(4.0);
//        conta1.transfere(conta, 1200.0);
//        System.out.println("Saldo Final da conta1 pós-transferencia "+ conta1.getSaldo_Conta());
//        System.out.println("Saldo final da Conta inicial pós-transferencia "+conta.getSaldo_Conta());


        //instância da classe conta corrente

        Contacorrente corrente = new Contacorrente("5432", "8585", 5 ,500.0);

//        corrente.depositar(200.0);
//        corrente.depositar(150.3);
//        corrente.sacar(30.3);
        //corrente.imp_extract();
//        System.out.println("Saldo Inicial conta corrente "+ corrente.getSaldo_Conta());
//        System.out.println("Cheque Especial "+Contacorrente.CHEQUE_ESPECIAL);
//        System.out.println("Saldo total corrente  "+ (corrente.getSaldo_Conta() + Contacorrente.CHEQUE_ESPECIAL));
//        System.out.println("========================================================================================");
//        System.out.println("========================================================================================");
//        System.out.println("========================================================================================");
//        System.out.println("========================================================================================");
        Contapoupanca Poupanca = new Contapoupanca("6666", "4444", 4 ,50094.0);
//        Poupanca.depositar(50.0);
//        Poupanca.sacar(20.3);
//        Poupanca.depositar(2000.0);
        //Poupanca.imp_extract();
//        System.out.println("Saldo Inicial conta poupança "+ Poupanca.getSaldo_Conta());
//        System.out.println("Rendimento Poupanca "+Contapoupanca.RENDIMENTO);
//        System.out.println("Saldo total Poupança "+ (Poupanca.getSaldo_Conta() * Contapoupanca.RENDIMENTO + Poupanca.getSaldo_Conta()));
        Gerente gerente = new Gerente();
        gerente.setNome("Matias");
        gerente.setGenero(Genero.MASCULINO);
        gerente.setCpf("123456");

        gerente.alterarlimiteconta(corrente, 8000.0);

        gerente.emitircartao(corrente, "2222114");

        gerente.RealizarEmprestimo(corrente,8000.00);
        Atendente atendente = new Atendente();
        atendente.setNome("Leandro");
        atendente.setGenero(Genero.FEMININO);


        atendente.alterarlimiteconta(corrente, 1000.0);
        atendente.emitircartao(corrente, "1255545");
    }
}
