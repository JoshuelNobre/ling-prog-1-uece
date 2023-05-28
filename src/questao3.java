import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int num1 = sc.nextInt();

        System.out.println("Insira o segundo número:");
        int num2 = sc.nextInt();

        System.out.println("Insira o terceiro número:");
        int num3 = sc.nextInt();

        if (num1 > 0) {
            System.out.println("Raiz quadrada do primeiro número: " + Math.sqrt(num1));
        } else {
            System.out.println("Quadrado do primeiro número: " + (num1 * num1));
        }

        if (num2 > 10 && num2 < 100) {
            System.out.println("Número está entre 10 e 100 – intervalo permitido");
        }

        if (num3 < num2) {
            System.out.println("Diferença entre o segundo e o terceiro número: " + (num2 - num3));
        } else {
            System.out.println("Terceiro número adicionado de 1: " + (num3 + 1));
        }
    }
}
