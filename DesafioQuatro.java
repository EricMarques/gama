
/*
Regra: implementar uma das estruturas de repetição na proposta

Proposta:
Fazer um programa em Java que armazene:
o nome, 
a idade e
a altura dos usuários

no final mostre como saída quantas pessoas
acima de 25 anos e maiores de 1.75 participaram da pesquisa.
*/

// Import da biblioteca Scanner
import java.util.Scanner;

public class DesafioQuatro {
    public static void main(String[] args) {
        // Criação da variável input de tipo Scanner
        Scanner input = new Scanner(System.in);

        /*
         * Declaração das variáveis de tipo 'int' que receberão:
         * - a idade dos entrevistados
         * - o contador de pessoas que participarão da pesquisa
         * - opção recebida pelo entrevistador
         */
        int age;
        int count = 0;
        int option;

        /*
         * Declaração de variável de tipo 'float' que receberá a altura dos
         * entrevistados
         */
        float height;

        /*
         * Declaração de variável de tipo 'String' que receberá o nome dos
         * entrevistados
         */
        String name = "";

        /*
         * Criação da variável overTwentyFive de tipo int
         * Esta variável será utilizada como um contador auxiliar.
         */
        int overTwentyFive = 0;

        System.out.println("\n++++ Censo Demográfico 2022 ++++");

        // Início do laço DO WHILE
        System.out.print("\n\nSelecione uma das opções:");
        do {
            System.out.print("\n1 - Cadastrar uma nova pessoa.\n" +
                    "2 - Sair\n" +
                    "Opção ==> ");
            option = input.nextInt();

            // Início da condicional SWITCH
            switch (option) {
                case 1:
                    // Opção de leitura dos dados dos entrevistados.
                    System.out.print("\n==== Dados da pessoa nº" + (count) + " ====\n");

                    System.out.print("Nome: ");
                    name = input.next();

                    System.out.print("Idade: ");
                    age = input.nextInt();

                    System.out.print("Altura: ");
                    height = input.nextFloat();

                    /*
                     * Verifica se os entrevistados satisfazem as condições:
                     * acima de 25 anos E maiores de 1.75m
                     */
                    if (age >= 25 && height > 1.75) {
                        overTwentyFive++;
                    }
                    break;

                case 2:
                    // Opção para encerramento do programa e apresentação dos resultados.
                    if (count == 0) {
                        System.out.println("\nNão existem pessoas cadastradas!\n");
                    } else {
                        System.out.printf("\nObrigado por responder o Censo 2022!\n" +
                                "\nForam entrevistadas %s pessoa(s), desta(s) %s é/são acima de 25 " +
                                "anos e maiore(s) de 1.75m.\n",
                                count, overTwentyFive);
                    }

                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!\n");
                    break;
            } // Fim da condicional SWITCH
            count++;

        } while (option == 1);
        // Fim do laço DO WHILE

        input.close();
    }
}
