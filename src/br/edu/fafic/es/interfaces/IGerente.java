package br.edu.fafic.es.interfaces;

import br.edu.fafic.es.model.Conta;
import br.edu.fafic.es.model.Contacorrente;

public interface IGerente {
     void AbirConta(Conta conta);
     void RealizarEmprestimo (Contacorrente contacorrente, Double valoremprestimo);
}
