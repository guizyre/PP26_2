# 🧮 Biblioteca de Operações Matemáticas

> Projeto desenvolvido para a disciplina de **Padrões de Projeto** — Curso de **Engenharia de Computação**.

---

### 👤 Autor
* **Nome:** Guilherme Gonçalves da Silva
* **Matrícula:** `202211250039`

---

## 🛠️ Ambiente de Desenvolvimento

| Parâmetro | Especificação |
| :--- | :--- |
| **Compilador Java** | Oracle OpenJDK 26.0.2 (Language Level 25) |
| **IDE** | IntelliJ IDEA 2025.2.5 (Ultimate Edition) |
| **Sistema Operacional** | Windows 11 |
| **Formato da Biblioteca** | `.jar` (`Calculadora_202211250039.jar`) |

---

## 🏛️ Arquitetura e Pacotes

A solução foi estruturada separando a regra de negócio do ambiente de testes do cliente:

* **`academy.guilherme.padroesProjeto.intro`**
  * `Calculadora_202211250039`: Núcleo da biblioteca (*Core*). Contém as operações matemáticas utilizando *varargs*, tratamento de indefinições aritméticas (divisão por zero) e interface CLI interativa.
* **`academy.guilherme.padroesProjeto.test`**
  * `Cliente_202211250039`: Classe consumidora com método `main`. Executa uma bateria de testes automáticos chamando os métodos públicos e inicializa o menu interativo.

---

## ⚙️ Métodos da Calculadora

Todas as operações foram construídas com suporte a **Varargs** (`double... valores`), permitindo um número arbitrário de argumentos.

### `soma(double... valores)`
* **Descrição:** Percorre todo o array acumulando os valores.
* **Retorno:** A soma de todos os números. Retorna `0` caso nenhum argumento seja informado.

### `subtracao(double... valores)`
* **Descrição:** Define o primeiro elemento como minuendo e subtrai sequencialmente os valores restantes.
* **Retorno:** Resultado da subtração. Retorna `0` para chamadas sem parâmetros.

### `multiplicacao(double... valores)`
* **Descrição:** Realiza a multiplicação sequencial de todos os valores fornecidos.
* **Retorno:** Produto final acumulado. Retorna `0` se nenhum argumento for passado.

### `divisao(double... valores)`
* **Descrição:** Assume o primeiro número como dividendo e divide consecutivamente pelos divisores subsequentes.
* **Tratamento de Exceções:** Bloqueia tanto $0 / 0$ quanto divisões por zero ($N / 0$). Informa a inconsistência no console e retorna `Double.NaN` para evitar que a aplicação quebre (*crash*).
* **Retorno:** Quociente da divisão ou `Double.NaN` caso ocorra uma divisão inválida.

### `menu()`
* **Descrição:** Inicializa um console interativo (`Scanner`) para inserção dinâmica de dados pelo usuário, efetuando o parse e apresentando os resultados na tela. O laço encerra ao informar `-1`.

---

## 🚀 Como Utilizar a Biblioteca

1. Adicione o arquivo `Calculadora_202211250039.jar` às dependências/bibliotecas do seu projeto Java.
2. No seu arquivo fonte, importe e utilize as operações:

```java
import academy.guilherme.padroesProjeto.intro.Calculadora_202211250039;

public class App {
    public static void main(String[] args) {
        Calculadora_202211250039 calc = new Calculadora_202211250039();

        // Utilização direta dos métodos:
        double soma = calc.soma(10, 20, 30);
        System.out.println("Soma: " + soma);

        // Ou inicialização do menu via CLI:
        calc.menu();
    }
}
```
