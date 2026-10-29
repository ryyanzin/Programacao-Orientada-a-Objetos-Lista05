package model.questao5;

public class RelatorioFinanceiro implements Imprimivel, EnviavelPorEmail {

    private String email;

    public RelatorioFinanceiro () {

        this.email = email;

    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo...");
    }

    @Override
    public void enviar(String email) {
        System.out.println("Enviando relatório financeiro para " + email);
    }

}
