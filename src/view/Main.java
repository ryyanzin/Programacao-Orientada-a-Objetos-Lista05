import model.questao3.Smartphone;
import model.questao4.OperacaoMatematica;

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
    System.out.println(soma.executar(10, 5));

    OperacaoMatematica subtracao = (a, b) -> a - b;
    System.out.println(subtracao.executar(10, 5 ));

    OperacaoMatematica multiplicacao = (a, b) -> a * b;
    System.out.println(multiplicacao.executar(10, 5 ));

    OperacaoMatematica divisao = (a, b) -> a / b;
    System.out.println(divisao.executar(10, 5 ));

}
