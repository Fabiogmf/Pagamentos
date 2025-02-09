import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void pagar(FormadePagamento processarpagamento) {
        processarpagamento.executar();
    }

    public static void main(String[] args) {
        FormadePagamento processarpagamento;
        System.out.println("Introduza o Tipo de Pagamento:\n");
        System.out.println("A)PayPal\nB)Cartão de Crédito\nC)MBWay\n");

        String opcao = in.nextLine();

        if (opcao.equalsIgnoreCase("a")) {
            processarpagamento = new PagamentoPayPal();
        }
        else if (opcao.equalsIgnoreCase("b")) {
            processarpagamento = new PagamentoCartaoCredito();
        }
        else if (opcao.equalsIgnoreCase("c")) {
            processarpagamento = new PagamentoMBWay();
        }
        else {
            throw new IllegalArgumentException("Opção Incorreta");
        }

        pagar(processarpagamento);
    }
}

class FormadePagamento {
    void executar(){
    }
}

class PagamentoPayPal extends FormadePagamento{
    @Override
    void executar(){
        System.out.println("Pagou com Paypal!");
    }
}
class PagamentoCartaoCredito extends FormadePagamento{
    @Override
    void executar(){
        System.out.println("Pagou com Cartão de crédito!");
    }
}
class PagamentoMBWay extends FormadePagamento{
    @Override
    void executar(){
        System.out.println("Pagou com MBWay!");
    }
}