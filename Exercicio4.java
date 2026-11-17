import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida em metros: ");
        double metros = sc.nextDouble();

        double centimetros = metros * 100;
        System.out.printf("%.2f m = %.2f cm%n", metros, centimetros);

        sc.close();
    }
}
