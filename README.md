# Programacao-Orientada-a-Objetos-Lista05
Lista de Exercícios - Programação Orientada a Objetos:

## Exercícios Teóricos

1.

A partir do Java 8, as interfaces passaram a permitir métodos com implementação, por meio de `default` e `static`.
   
`default`: fornece uma implementação padrão que pode ser utilizada ou sobrescrita pelas classes.

`static`: define métodos chamados diretamente pela interface, sem precisar criar um objeto.

Exemplo:

```
public interface Operacao {
    double calcular(double a, double b);

    default void exibir() {
        System.out.println("Executando operação");
    }

    static void ajuda() {
        System.out.println("Ajuda da interface");
    }
}
```
---

2.

As interfaces definem contratos que as classes devem seguir, reduzindo a dependência entre componentes específicos. Isso facilita a manutenção, a substituição de implementações, a realização de testes e a inclusão de novas funcionalidades.

Exemplo prático de uso de interfaces:

Em um sistema de pagamentos, podemos utilizar uma interface para permitir diferentes formas de pagamento, como cartão e Pix.

```
public interface Pagamento {
    void pagar(double valor);
}
```


```
public class PagamentoPix implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento via Pix");
    }
}
```
```
public class Pedido {
    private Pagamento pagamento;

    public Pedido(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void finalizar(double valor) {
        pagamento.pagar(valor);
    }
}
```
Assim, a classe `Pedido` depende da interface `Pagamento`, e não de uma classe concreta. Isso permite adicionar novas formas de pagamento sem precisar modificar a lógica principal do pedido.
