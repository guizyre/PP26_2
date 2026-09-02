package academy.guilherme.padroesProjeto.intro;
import java.util.ArrayList;
import java.util.Scanner;


public class Calculadora_202211250039 {
    public double soma(double... valores) {
        double tot = 0;
        for (double valor : valores) {
            tot += valor;
        }
        return tot;
    }

    public double subtracao(double... valores) {
        if (valores.length == 0) {
            return 0;
        }

        double tot = valores[0];
        for (int i = 1; i < valores.length; i++) {
            tot -= valores[i];
        }
        return tot;
    }

    public double multiplicacao(double... valores) {
        if (valores.length == 0) return 0;

        double tot = 1;
        for (double valor : valores) {
            tot *= valor;
        }
        return tot;
    }

    public double divisao(double... valores) {
        if (valores.length == 0) return 0;

        double tot = valores[0];

        for (int i = 1; i < valores.length; i++) {
            // Trava especificamente se o valor atual for 0 e a tentativa for dividir por 0
            if (tot == 0 && valores[i] == 0) {
                System.out.println("Erro! 0 dividido por 0 não existe.");
                return Double.NaN;
            }

            if (valores[i] == 0) {
                System.out.println("Erro de divisão! Tentou dividir por 0.");
                return Double.NaN;
            }
            tot /= valores[i];
        }
        return tot;
    }

    public void menu() {
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        while (opcao != -1) {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Qual Operação desejas?");
            System.out.println("=---=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");
            System.out.println("opção 1: Somar");
            System.out.println("opção 2: subtracao");
            System.out.println("opção 3: multiplicacao");
            System.out.println("opção 4: Divisao");
            System.out.println("Escolha -1 para Encerrar");

            opcao = input.nextInt();
            input.nextLine();

            if (opcao == -1) {
                System.out.println("Encerrando calculadora.");
                break;
            }

            if (opcao >= 1 && opcao <= 4) {
                ArrayList<Double> valores_list = new ArrayList<>();
                System.out.println("\n[Digite valores. Quando quiser o resultado digite '='] ");

                while (true) {
                    System.out.print("Digite o " + (valores_list.size() + 1) + "º valor (ou '='): ");
                    String entrada = input.nextLine();

                    if (entrada.equals("=")) {
                        break;
                    }
                    try {
                        double numero = Double.parseDouble(entrada.replace(",", "."));
                        valores_list.add(numero);
                    } catch (NumberFormatException e) {
                        System.out.println("Isso não parece um número válido. Tente novamente.");
                    }
                }

                if (valores_list.isEmpty()) {
                    System.out.println("\nNenhum número foi digitado!\n");
                    continue;
                }


                double[] valoresParaCalcular = new double[valores_list.size()];
                for (int i = 0; i < valores_list.size(); i++) {
                    valoresParaCalcular[i] = valores_list.get(i);
                }

                double resultado = 0;

                switch (opcao) {
                    case 1:
                        resultado = this.soma(valoresParaCalcular);
                        break;
                    case 2:
                        resultado = this.subtracao(valoresParaCalcular);
                        break;
                    case 3:
                        resultado = this.multiplicacao(valoresParaCalcular);
                        break;
                    case 4:
                        resultado = this.divisao(valoresParaCalcular);
                        break;
                }

                System.out.println("\n---> RESULTADO: " + resultado + " <--- \n");
            } else {
                System.out.println("\nOpção inválida!\n");
            }

        }

    }
}
