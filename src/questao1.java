import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o dividendo:");
        int dividendo = sc.nextInt();

        System.out.println("Insira o divisor:");
        int divisor = sc.nextInt();

        int quociente = dividendo / divisor;
        int resto = dividendo % divisor;

        System.out.println("Dividendo: " + dividendo);
        System.out.println("Divisor: " + divisor);
        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }
}
