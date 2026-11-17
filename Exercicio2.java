import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo numero inteiro: ");
        int b = sc.nextInt();

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtracao: " + (a - b));
        System.out.println("Multiplicacao: " + (a * b));

        if (b != 0) {
            // (double) evita a divisao inteira (ex.: 7 / 2 = 3)
            System.out.println("Divisao: " + ((double) a / b));
        } else {
            System.out.println("Divisao: nao e possivel dividir por zero.");
        }

        sc.close();
    }
}
