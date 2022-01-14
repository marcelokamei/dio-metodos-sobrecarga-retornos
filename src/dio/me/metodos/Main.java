package dio.me.metodos;

public class Main {
    public static void main(String[] args) {

        //calculadora
        System.out.println("Calculadora");
        Calculadora.soma(5,18);
        Calculadora.subtracao(15,9);
        Calculadora.multiplicacao(8,8);
        Calculadora.divisao(45,9);

        //mensagem
        System.out.println("Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Emprestimo
        System.out.println("Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
