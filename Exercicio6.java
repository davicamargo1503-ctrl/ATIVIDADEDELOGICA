import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome de usuario: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.print("A conta esta ativa? (true ou false): ");
        boolean ativa = sc.nextBoolean();

        System.out.println("\nDados cadastrados:");
        System.out.println("Usuario: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Conta ativa: " + ativa);

        sc.close();
    }
}
