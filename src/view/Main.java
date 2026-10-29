import model.questao3.*;
import model.questao4.*;
import model.questao5.*;
import java.util.Arrays;
import java.util.List;

void main() {

    // Questão 3

    Smartphone smartphone = new Smartphone ("Apple", "Iphone 26", false, 37);

    smartphone.ligar();
    smartphone.atender();
    smartphone.exibirPagina();
    smartphone.adicionarNovaAba();
    smartphone.tocar();
    smartphone.pausar();


    // Questão 4 - Expressões lambda

    OperacaoMatematica soma = (a, b) -> a + b;
    System.out.println("\nO resultado da soma é: " + soma.executar(10, 5));

    OperacaoMatematica subtracao = (a, b) -> a - b;
    System.out.println("O resultado da subtração é: " + subtracao.executar(10, 5 ));

    OperacaoMatematica multiplicacao = (a, b) -> a * b;
    System.out.println("O resultado da multiplicação é: " + multiplicacao.executar(10, 5 ));

    OperacaoMatematica divisao = (a, b) -> a / b;
    System.out.println("O resultado da divisão é: " + divisao.executar(10, 5) + "\n");

    // Questão 5

    RelatorioFinanceiro relatorio =  new RelatorioFinanceiro();

    Contrato contrato = new Contrato();

    List<Imprimivel> documentos = Arrays.asList( relatorio,  contrato );

    for (Imprimivel documento : documentos) {
        documento.imprimir();
    }

    List<EnviavelPorEmail> enviaveis = Arrays.asList( relatorio );

    for (EnviavelPorEmail documento : enviaveis) {
        documento.enviar("usuario@email.com");
    }

}
