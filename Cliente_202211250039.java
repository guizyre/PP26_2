package academy.guilherme.padroesProjeto.test;
import academy.guilherme.padroesProjeto.intro.Calculadora_202211250039;

public class Cliente_202211250039 {
    public static void main(String[] args) {
        Calculadora_202211250039 calculadora = new Calculadora_202211250039();
        System.out.println("TESTES AUTOMÁTICOS DA BIBLIOTECA");
        System.out.println("Soma (10, 5) = " + calculadora.soma(10, 5));
        System.out.println("Subtração (20, 8) = " + calculadora.subtracao(20, 8));
        System.out.println("Multiplicação (4, 4) = " + calculadora.multiplicacao(4, 4));
        System.out.println("Divisão (100, 2) = " + calculadora.divisao(100, 2));

        System.out.println("\n INICIANDO MENU INTERATIVO");
        calculadora.menu();
    }

}
