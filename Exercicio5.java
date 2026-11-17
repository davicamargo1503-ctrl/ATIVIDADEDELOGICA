import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade em anos: ");
        int idade = sc.nextInt();

        int dias = idade * 365;
        System.out.println("Voce viveu aproximadamente " + dias + " dias.");

        sc.close();
    }
}
