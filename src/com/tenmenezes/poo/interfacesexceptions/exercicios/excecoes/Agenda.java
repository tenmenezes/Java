package com.tenmenezes.poo.interfacesexceptions.exercicios.excecoes;

public class Agenda {

    //  Array de contatos para cada contato criado
    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public void adicionarContato(Contato c) throws AgendaCheiaException {
        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = c;
                return;
            }
        }
        if (cheia) {
            throw new AgendaCheiaException();
        }

    }

    public int consultarContatosPorNome(String nome) throws ContatoNaoExisteException {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                    return i;
                }
            }
        }
        throw new ContatoNaoExisteException(nome);
    }

    @Override
    public String toString() {
        String s = "";
        for(Contato c : contatos) {
            if(c != null) {
                s += c.toString() + "\n";
            }
        }
        return s;
    }
}
