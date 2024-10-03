import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int agencia = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Por favor, digite o número da conta !");
        String num = entrada.nextLine();
        System.out.println("Por favor, digite o Seu nome completo !");
        String nome = entrada.nextLine();
        System.out.println("Por favor, digite o seu saldo !");
        double saldo = entrada.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + num + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
