package com.tenmenezes.poo.interfacesexceptions.exercicios.excecoes;

import java.util.ArrayList;
import java.util.Arrays;

public class Agenda {

    //  Array de contatos para cada contato criado
    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public void adicionarContato(Contato c) throws AgendaCheiaException{
        boolean cheia = true;
        for(int i = 0; i < contatos.length; i++) {
            if(contatos[i] != null) {
                contatos[i] = c;
                cheia = false;
            }
        }
        if(cheia) {
            throw new AgendaCheiaException();
        }

    }

    public int consultarContatosPorNome(String nome) throws ContatoNaoExisteException{
        for(int i = 0; i < contatos.length; i++) {
            if(contatos[i] != null) {
                if(contatos[i].getNome().equalsIgnoreCase(nome)) {
                    return i;
                }
            }
        }
        throw new ContatoNaoExisteException();
    }

}
