/*
 * Exercício proposto para a verificação do MAIOR e o MENOR número
 * dentre três números digitados por um usuário via terminal.
*/

// Scanner não havia sido importado
import java.util.Scanner; 

public class DesafioTres {
    public static void main(String[] args) {
        // Criação da variável sc(Scanner)
        Scanner sc = new Scanner(System.in);

        // Criação das variáveis (n1, n2 e n3) de tipo inteiro(int/Integer)
        int n1, n2, n3;

        // Leitura dos valores(n1, n2 e n3) do usuário via teclado
        System.out.print("Entre com o primeiro inteiro: ");
        n1 = sc.nextInt();
        System.out.print("Entre com o segundo inteiro: ");
        n2 = sc.nextInt();
        System.out.print("Entre com o terceiro inteiro: ");
        n3 = sc.nextInt();

        // Verifica dentre os números informados pelo usuário(n1 e n2) o menor e o maior valor.
        if (n1 > n2) {
            if (n1 > n3) {
                if (n2 < n3) {
                    System.out.println("O menor numero eh: " + n2);
                } else {
                    System.out.println("O menor numero eh: " + n3);
                }
                System.out.println("O maior numero eh: " + n1);
            } else {
                if (n1 < n2) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n2);
                }
                System.out.println("O maior numero eh: " + n3);
            }

        // Verifica dentre os números informados pelo usuário(n2 e n3) o menor e o maior valor.
        } else {
            if (n2 > n3) {
                if (n1 < n3) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n3);
                }
                System.out.println("O maior numero eh: " + n2);
            } else {
                if (n1 < n2) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n2);
                }
                System.out.println("O maior numero eh: " + n3);
            }
        }

        sc.close(); // <== Scanner não havia sido fechado

    } // <== Havia faltado este 'fecha chaves' da main.
}
