public class ContaCorrente {

    int numConta;
    double saldoDaConta;
    boolean contaEspecial = false;
    double limiteDaConta;

    void depositarDinheiro(double valorRecebido) {

        System.out.println("\n R$ " + String.format("%.2f", valorRecebido) + " depositado com sucesso!\n");

        saldoDaConta += valorRecebido;

    }

    void sacarDinheiro(double valorDoSaque) {

        if (contaEspecial && valorDoSaque <= saldoDaConta + limiteDaConta) {

            System.out.println("\nSaque realizado com sucesso!\n");

            saldoDaConta -= valorDoSaque;

        } else if (!contaEspecial && valorDoSaque <= saldoDaConta) {

            System.out.println("\nSaque realizado com sucesso!\n");

            saldoDaConta -= valorDoSaque;

        } else {
            System.out.println("Erro: Saque negado.");
        }

    }

    double verificaSaldoAtual() {
        return saldoDaConta;
    }

    void usandoLimiteDaConta() {

        if (contaEspecial && saldoDaConta < 0) {
            System.out.println("\nVocê atualmente está usando seu limite da conta.\n");
        } else if (contaEspecial && saldoDaConta >= 0) {
            System.out.println("\nVocê não está usando seu limite da conta.\n");
        } else {
            System.out.println("\nVocê não pode verificar isto pois sua conta não é especial.\n");
        }
    }
}
