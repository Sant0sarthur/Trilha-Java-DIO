import java.util.Scanner;

public class bancoMain {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        pessoa cliente = new pessoa();

        System.out.println("Informe o seu nome: ");
        cliente.nomeCliente = sc.nextLine();

        System.out.println("Informe o número da agencia: ");
        cliente.agencia = sc.nextLine();

        System.out.println("Informe o número da conta: ");
        cliente.numConta = sc.nextInt();

        System.out.println("Informe o seu saldo: ");
        cliente.saldoConta = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", cliente.nomeCliente, cliente.agencia, cliente.numConta, cliente.saldoConta);

        sc.close();
    }
}
