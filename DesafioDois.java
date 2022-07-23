/*
 Faça um programa em Java para ler um número que é um código de usuário.
 Caso este código seja diferente de um código armazenado internamente no 
 algoritmo (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’.
 Caso o Código seja correto, deve ser lido outro valor que é a senha. Se esta
 senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’.
 Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’
*/
import java.util.Scanner;

public class DesafioDois {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o código do usuário: ");
        int userCode = input.nextInt();

        if (userCode == 1234) {
            System.out.print("Digite a senha do usuário: ");
            int userPassword = input.nextInt();

            System.out.println((userPassword == 9999) ? "Acesso permitido!" : "Senha incorreta!");
        } else {
            System.out.println("Usuário inválido!");
        }

        input.close();

    }
}
