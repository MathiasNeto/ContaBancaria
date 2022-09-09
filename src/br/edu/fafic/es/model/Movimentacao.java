package br.edu.fafic.es.model;

import br.edu.fafic.es.enums.TipoMovimentacao;
import br.edu.fafic.es.utils.Datautil;

import java.util.Date;

public class Movimentacao {

    private TipoMovimentacao tipoMoviment;
    private Date dataMoviment;
    private Double valorMoviment;

    public Movimentacao(TipoMovimentacao tipoMoviment, Double valorMoviment) { // Construtor
        this.tipoMoviment = tipoMoviment;
        this.dataMoviment = new Date();
        this.valorMoviment = valorMoviment;



    }
    public TipoMovimentacao getTipoMoviment() {
        return tipoMoviment;
    }

    public void setTipoMoviment(TipoMovimentacao tipoMoviment) {
        this.tipoMoviment = tipoMoviment;
    }

    public Date getDataMoviment() {
        return dataMoviment;
    }

    public void setDataMoviment(Date dataMoviment) {
        this.dataMoviment = dataMoviment;
    }

    public Double getValorMoviment() {
        return valorMoviment;
    }

    public void setValorMoviment(Double valorMoviment) {
        this.valorMoviment = valorMoviment;
    }


    @Override
    public String toString(){
        return tipoMoviment +  "Data = " + Datautil.converterdatahora(dataMoviment) + " valorMoviment = "+ valorMoviment +"\n";
    }


}
