import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o número da agência: ");
        String agencia = scan.nextLine();

        System.out.print("\nDigite o número da conta: ");
        Integer numero = scan.nextInt();
        scan.nextLine();

        System.out.print("\nDigite o nome do cliente: ");
        String nomeCliente = scan.nextLine();

        System.out.print("\nDigite o saldo da conta: ");
        Double saldo = scan.nextDouble();

        Conta conta = new Conta(numero, agencia, nomeCliente, saldo);

        System.out.println("\nConta criada com sucesso!\n");
        System.out.println("""
                Olá %s, sua conta foi criada com sucesso!
                Agência: %s
                Número: %d
                Saldo: R$ %.2f
                """.formatted(conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo()));

        scan.close();
    }
}
