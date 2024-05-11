import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanNum = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        System.out.println("- INSERÇÃO DE DADOS -");
        System.out.print("\nInsira o número da conta: ");
        int numeroConta = scanNum.nextInt();

        System.out.print("Insira o número da agência: ");
        String agencia = scanStr.nextLine();

        System.out.print("Insira o nome do cliente: ");
        String nomeCliente = scanStr.nextLine();

        System.out.print("Insira o saldo bancário: ");
        float saldo = scanNum.nextFloat();

        System.out.println("\n- CONFIRMAÇÃO DE CADASTRO -");
        System.out.printf("\nOlá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);
    
        
    }
}
