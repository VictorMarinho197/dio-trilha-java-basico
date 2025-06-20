import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o seu nome:");
        String nomeCliente = scan.nextLine();
        System.out.println("Informe a sua agência, com o dígito:");
        String agencia = scan.nextLine();
        System.out.println("Informe o número da conta:");
        int numeroConta = scan.nextInt();
        System.out.println("Agora, informe o seu saldo:");
        double saldo = scan.nextDouble();

        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);
    }
}
