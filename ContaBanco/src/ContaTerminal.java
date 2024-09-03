import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc =  new Scanner(System.in);

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Olá, seja bem vindo ao Banco Spring, por gentileza digite os dados abaixo: ");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da conta: ");
        int conta = sc.nextInt();
        System.out.println("Por gentileza, digite o seu nome: ");
        String nome = sc.nextLine();
        sc.nextLine();
        System.out.println("Por gentileza, digite o seu saldo: ");
        float saldo = sc.nextFloat();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " conta: " + conta + " e seu saldo " + saldo + ", já está disponível para saque");

        
    }
}
