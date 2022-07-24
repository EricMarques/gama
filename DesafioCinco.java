/*
 * Proposta:
 * Tem-se um conjunto de dados contendo a altura e o sexo de 10 pessoas. Fazer um programa que calcule e escreva:
    a. a maior e a menor altura do grupo;
    b. média de altura dos homens;
    c. o número de mulheres.
    
    Dica:
    PODE ser usado Vetores, mas não de forma obrigatória
*/
import java.io.IOException;
import java.util.Scanner;
public class DesafioCinco {
    public static void main(String[] args) throws IOException {
        // Criação da variável input de tipo 'Scanner'
        Scanner input = new Scanner(System.in);

        /*
         * Declaração das variáveis de tipo 'int' que receberão:
         * - o contador de pessoas que participarão da pesquisa
         * - a quantidade de homens
         * - a quantidade de mulheres
         * - a quantidade de não informados ou informados incorretamente
         */
        int people = 10, men = 0, women = 0, uninformed = 0;

        // Criação da variável gender de tipo 'char'
        char gender;

        /*
         * Declaração de variáveis de tipo 'float' que receberão:
         * - a altura das pessoas
         * - a soma das alturas dos homens
         */
        float height = 0, sumHeightMen = 0 ,greatestHeight = 0, shorterHeight = 9999;

        // Início do laço FOR
        for (int i = 0; i < people; i++) {
            //Efetua a leitura da altura da pessoa.
            System.out.print("\nInforme a altura da " + (i+1) + "ª pessoa: ");
            height = input.nextFloat();

            //Efetua a leitura do gênero da pessoa.
            System.out.print("Informe o gênero (M/F) desta pessoa: ");
            gender = (char)System.in.read();

            // Condição que verifica Maiores E Menores alturas
            if (height > greatestHeight) {
                greatestHeight = height;
            } else {
                shorterHeight = height;                
            }

            // Condição que verifica gênero
            if (gender == 'M' || gender == 'm') {
                men++;
                sumHeightMen += (height * 1.0);
            } else if (gender == 'F' || gender == 'f') {
                women++;
            } else {
                System.out.println("\nGênero informado incorretamente!\n");
                uninformed++;
            }
        } // Fim do laço FOR

        input.close();

        // Resultados
        System.out.printf("\nA maior altura é: %.2f\nA menor altura é: %.2f", greatestHeight, shorterHeight);
        System.out.printf("\nMedia altura dos homens: %.2f",(sumHeightMen/men));
        System.out.printf("\nQuantidade de mulheres: %s", women);
        System.out.printf("\nGênero não informado ou informado incorretamente: %s\n", uninformed);

    }
}
