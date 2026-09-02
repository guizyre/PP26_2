=============================================================================
                  BIBLIOTECA DE OPERAÇÕES MATEMÁTICAS
=============================================================================

AUTOR: Guilherme Gonçalves da Silva
MATRÍCULA: 202211250039
DISCIPLINA: Engenharia de Computação - Padrões de Projeto

=============================================================================
1. AMBIENTE DE DESENVOLVIMENTO (REQUISITOS TÉCNICOS)
=============================================================================
- Versão do compilador Java: Oracle OpenJDK 26.0.2 (Language Level 25)
- IDE e versão utilizada: IntelliJ IDEA 2025.2.5 (Ultimate Edition
- Sistema Operacional: Windows 11
- Tipo da Biblioteca gerada: .jar

=============================================================================
2. ARQUITETURA E CLASSES DO PROJETO
=============================================================================
O projeto foi dividido em pacotes lógicos para separar a regra de negócio 
da classe de execução, garantindo uma boa estrutura de engenharia de software:

-> Pacote: academy.guilherme.padroesProjeto.intro
* Classe Calculadora_202211250039: 
  Classe principal da biblioteca (Core). Contém toda a lógica de negócio, 
  cálculos matemáticos e o tratamento rigoroso de exceções (como a 
  prevenção de divisões por zero). Ela foi projetada para ser instanciada 
  e consumida por clientes externos.

-> Pacote: academy.guilherme.padroesProjeto.test
* Classe Cliente_202211250039: 
  Classe de teste e validação. Contém o método 'main' utilizado pelo autor 
  para instanciar a Calculadora e testar o funcionamento interno da 
  biblioteca durante o desenvolvimento.

=============================================================================
3. DESCRIÇÃO DOS MÉTODOS (Classe Calculadora_202211250039)
=============================================================================
A classe foi construída utilizando o recurso de Varargs (double... valores), 
permitindo que o usuário passe uma quantidade infinita de números para 
cada operação.

1. soma(double... valores)
   - Comportamento: Itera sobre o array recebido, somando todos os elementos.
   - Retorno: O valor total da soma. Retorna 0 se nenhum valor for passado.

2. subtracao(double... valores)
   - Comportamento: Define o primeiro número do array como o "minuendo" e 
     subtrai todos os valores subsequentes dele.
   - Retorno: O valor total da subtração. Retorna 0 em caso de array vazio.

3. multiplicacao(double... valores)
   - Comportamento: Realiza a multiplicação sequencial de todos os valores 
     passados no parâmetro.
   - Retorno: O valor total da multiplicação. Retorna 0 em caso de array vazio.

4. divisao(double... valores)
   - Comportamento: Utiliza o primeiro número recebido como dividendo e o 
     divide sequencialmente pelos números seguintes (divisores).
   - Segurança: Possui travas lógicas que impedem indefinições matemáticas 
     (0 dividido por 0) e impossibilidades matemáticas (N dividido por 0).
   - Retorno: O quociente da divisão. Em caso de infração matemática (divisão 
     por zero), retorna 'Double.NaN' para alertar o sistema cliente sobre a 
     operação inválida.

5. menu()
   - Comportamento: Inicia uma interface de linha de comando (CLI) interativa. 
     Permite ao usuário final navegar pelas 4 operações matemáticas, inserir 
     dados dinamicamente através do console (Scanner) e visualizar o resultado 
     final processado pela calculadora. O loop é encerrado ao digitar -1.

=============================================================================
4. GUIA DE UTILIZAÇÃO (Para o Cliente)
=============================================================================
Para utilizar esta biblioteca, o aluno/cliente deve:
1. Importar o arquivo padroes.jar (ou Calculadora_202211250039.jar) nas 
   dependências (Libraries) do seu projeto Java.
2. Na sua classe Main, realizar o import:
   import academy.guilherme.padroesProjeto.intro.Calculadora_202211250039;
3. Instanciar o objeto e chamar o método .menu() para iniciar a aplicação.
=============================================================================
