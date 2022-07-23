
/*
Regra: implementar uma das estruturas de repetição na proposta

Proposta:
Fazer um programa em Java que armazene:
o nome, 
a idade e
a altura dos usuários

no final mostre como saída quantas pessoas acima de 25 anos e maiores de 1.75 participaram da pesquisa.

*/

// Import da biblioteca Scanner
import java.util.Scanner;

public class DesafioQuatro {
    public static void main(String[] args) {
        // Criação da variável input de tipo Scanner
        Scanner input = new Scanner(System.in);

        /*
        Criação da variável overTwentyFive de tipo int
        Esta variável armazenará a quantidade de pessoa que estão compreendidas acima de 25 anos e maiores de 1.75m
        */
        int overTwentyFive = 0;

        System.out.print("Informe a quantidade de pessoa que participarão desta pesquisa: ");
        // Inicialização da variável que receberá a quantidade de pessoas que participarão da pesquisa.
        int count = input.nextInt();

        // Início do laço FOR
        for (int i = 1; i <= count; i++) {
            System.out.print("\n==== Dados da pessoa nº" + i + " ====\n");

            System.out.print("Nome: ");
            String name = input.next();

            System.out.print("Idade: ");
            int age = input.nextInt();

            System.out.print("Altura: ");
            float height = input.nextFloat();

            // Verifica se os entrevistados satisfazem as condições acima de 25 anos E maiores de 1.75m
            if (age >= 25 && height >= 1.75) {
                overTwentyFive++;
            }
        }
        // Fim do laço FOR

        System.out.printf(
                "Foram entrevistadas %s pessoa(s), desta(s) %s é/são acima de 25 anos e maiore(s) de 1.75m.\n", count,
                overTwentyFive);

        input.close();
    }
}
