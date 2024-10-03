import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = entrada.nextInt();
        System.out.println("Por favor, digite a Agência !");
        String agencia = entrada.nextLine();
        System.out.println("Por favor, digite o Seu nome completo !");
        String nome = entrada.nextLine();
        System.out.println("Por favor, digite o seu saldo !");
        double saldo = entrada.nextDouble();
    }
}
