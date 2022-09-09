package br.edu.fafic.es.interfaces;

import br.edu.fafic.es.model.Conta;
import br.edu.fafic.es.model.Contacorrente;

public interface IAtendente {

    void emitircartao(Conta conta, String numerocartao);

    void alterarlimiteconta(Contacorrente contacorrente, Double novoLimite);


}
