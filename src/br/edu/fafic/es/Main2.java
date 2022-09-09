package br.edu.fafic.es;

import br.edu.fafic.es.enums.Genero;
import br.edu.fafic.es.model.Pessoa;

public class Main2 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setGenero(Genero.FEMININO);


        System.out.println(pessoa.toString());
    }
}
