package com.tenmenezes.javaintermediario.enums.abstractmethods;

public enum TipoDocumento {

    CPF {
        @Override
        public String geraNumeroTeste() {
            return GerarCpfCnpj.cpf();
        }
    }, CNPJ {
        @Override
        public String geraNumeroTeste() {
            return GerarCpfCnpj.cnpj();
        }
    };

    public abstract String geraNumeroTeste();

}
