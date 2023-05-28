import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a base do retângulo:");
        int base = sc.nextInt();

        System.out.println("Insira a altura do retângulo:");
        int altura = sc.nextInt();

        int perimetro = 2 * (base + altura);
        int area = base * altura;

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
    }
}
