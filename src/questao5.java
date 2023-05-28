import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do lado A do triângulo:");
        int ladoA = sc.nextInt();

        System.out.println("Insira o valor do lado B do triângulo:");
        int ladoB = sc.nextInt();

        System.out.println("Insira o valor do lado C do triângulo:");
        int sideC = sc.nextInt();

        if (ladoA < ladoB + sideC && ladoB < ladoA + sideC && sideC < ladoA + ladoB) {
            if (ladoA == ladoB && ladoB == sideC) {
                System.out.println("Triângulo Equilátero");
            } else if (ladoA != ladoB && ladoB != sideC && ladoA != sideC) {
                System.out.println("Triângulo Escaleno");
            } else {
                System.out.println("Triângulo Isósceles");
            }
        } else {
            System.out.println("Os valores inseridos não formam um triângulo");
        }
    }
}
