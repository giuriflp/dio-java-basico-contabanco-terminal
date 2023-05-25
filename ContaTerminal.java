import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Olá cliente, qual o seu nome?");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite o número da agência: ");
        agencia = scanner.nextLine();
        System.out.println("Digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.println("Digite seu saldo: ");
        saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");


    }
}