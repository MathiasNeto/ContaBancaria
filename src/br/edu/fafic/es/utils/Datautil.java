package br.edu.fafic.es.utils;

import jdk.dynalink.linker.support.SimpleLinkRequest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datautil {
    private static SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static String converterdatahora(Date date){
        return formatador.format(date);
    }
}
