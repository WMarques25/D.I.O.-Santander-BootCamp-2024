import model.Banco;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente well = new Cliente();
        well.setNome("Well");

        Conta cc = new ContaCorrente(well);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(well);
        cc.transferir(50, poupanca);

        cc.imprimiraExtrato();
        poupanca.imprimiraExtrato();
        
        Banco.listarContas();
    }
}
